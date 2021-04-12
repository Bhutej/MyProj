package com.tyss.quizassign.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
public class Results implements Serializable {

	@Column
	private int id;
	@Id
	@Column
	private Date time_Date;
	@Column
	private int marks;
	@Column
	private int percentage;

	
}
