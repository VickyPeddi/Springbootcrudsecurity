package com.example.springjwt.service;

import com.example.springjwt.dao.MyUserdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserdetailsservice
        implements UserDetailsService
{
    @Autowired
    private MyUserdao repos;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.example.springjwt.model.User username1 = repos.getUserByUsername(username);
        return new User(username1.getUsername(), username1.getPassword(), new ArrayList<>());
    }
}
