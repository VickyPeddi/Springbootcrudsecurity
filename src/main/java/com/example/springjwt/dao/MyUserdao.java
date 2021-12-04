package com.example.springjwt.dao;

import com.example.springjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserdao extends JpaRepository<User, Integer> {
    public User getUserByUsername(String username);
}
