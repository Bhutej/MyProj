package com.tyss.quizassign.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class QuizQuestions implements Serializable {

	@Id
	@Column
	private int id;
	@Column
	private String quest1;
	@Column
	private String quest2;
	@Column
	private String quest3;
	@Column
	private String quest4;
	@Column
	private String quest5;
	@Column
	private String quest1answer;
	@Column
	private String quest2answer;
	@Column
	private String quest3answer;
	@Column
	private String quest4answer;
	@Column
	private String quest5answer;

}
