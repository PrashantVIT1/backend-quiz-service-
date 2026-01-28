package com.quiz_time.quiz_time.dao;

import com.quiz_time.quiz_time.model.Quiz;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer>{

}
