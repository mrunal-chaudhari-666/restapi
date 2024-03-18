package com.example.quizapp.dao;

import com.example.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface   Questiondao extends JpaRepository<Question,Integer> {
   List<Question> findByCategory(String category);
}
