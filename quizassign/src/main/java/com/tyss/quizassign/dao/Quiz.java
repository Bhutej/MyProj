package com.tyss.quizassign.dao;

import java.util.Date;

import com.tyss.quizassign.dto.QuizQuestions;
import com.tyss.quizassign.dto.Register;
import com.tyss.quizassign.dto.Results;

interface Quiz {
	
	abstract  Register login(String username,String Password);
	
	abstract  Register register(Register register);
	
	abstract QuizQuestions questions(int id);
	
	abstract void results(Results results);
	
	abstract Results getResults(Date date);

}
