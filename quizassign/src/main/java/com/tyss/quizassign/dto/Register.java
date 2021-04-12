package com.tyss.quizassign.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
public class Register implements Serializable {

	@Column
	@Id
	private String username;
	@Column
	private String password;
	@Column
	private String confirmpassword;

}
