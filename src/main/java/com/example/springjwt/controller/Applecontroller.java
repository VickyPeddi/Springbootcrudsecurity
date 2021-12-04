package com.example.springjwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springjwt.model.User;
import com.example.springjwt.service.MyUserservice;

@RestController
@RequestMapping("/user")
public class Applecontroller {
	@Autowired
	private MyUserservice service;

	@GetMapping("/")
	public ModelAndView getallMangos() {
		List<User> users = service.getallUsers();
		return new ModelAndView("Apple/AppleDetails", "users", users);
	}

	@RequestMapping("/user")
	public ModelAndView createpage(@ModelAttribute("user") User user) {
		return new ModelAndView("Apple/CreateApple");
	}

	@PostMapping("/adduser")
	public ModelAndView addUser(@ModelAttribute("user") User user) {
		User user1 = service.createuser(user);
		return new ModelAndView("redirect:/user/");
	}

	@RequestMapping("/delete/{id}")
	public ModelAndView deleteApple(@PathVariable("id") int id) {
		service.deleteuser(id);
		return new ModelAndView("redirect:/user/");

	}

	@RequestMapping("/update/{id}")
	public ModelAndView updateUser(@PathVariable("id") int id) {
		User user = service.getoneUser(id);
		return new ModelAndView("Apple/CreateApple", "user", user);
	}

	@RequestMapping("/generatetoken")
	public ModelAndView generatetoken() {

		return new ModelAndView("Testpage");
	}
}
