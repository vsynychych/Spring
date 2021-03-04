package com.example.spring.Lesson1.dao;

import com.example.spring.Lesson1.models.Calculator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculatorDao extends JpaRepository<Calculator, Integer> {

}
