package com.example.spring.Lesson1.dao;


import com.example.spring.Lesson1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface UserDao extends JpaRepository<User,Integer> {
}
