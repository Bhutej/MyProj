package com.te.springmvc2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.springmvc2.bean.EmployeeBean;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public EmployeeBean authenticate(int id, String password) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empl");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {
			EmployeeBean bean = entityManager.find(EmployeeBean.class, id);
			if (bean != null) {
				if (bean.getPassword().equalsIgnoreCase(password)) {
					System.out.println("login successfull");
					return bean;
				} else {
					System.out.println("invalid credentials");
					return null;
				}
			} else {
				System.out.println("user not found");
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public EmployeeBean searchemp(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empl");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EmployeeBean bean = entityManager.find(EmployeeBean.class, id);
		if (bean != null) {
			return bean;
		} else {
			return null;
		}

	}

	@Override
	public boolean deleteEmp(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empl");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		EmployeeBean employeeBean = entityManager.find(EmployeeBean.class, id);
		if (employeeBean != null) {
			entityManager.remove(employeeBean);
			entityTransaction.commit();
		} else {
			return false;
		}
		return false;

	}

	@Override
	public List<EmployeeBean> getAllData() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("empl");

		EntityManager manager = factory.createEntityManager();

		String query = "from EmployeeBean";

		javax.persistence.Query query2 = manager.createQuery(query);

		List<EmployeeBean> list = query2.getResultList();
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

}
