package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.userDomain;
import com.example.demo.services.userServices;
//import com.example.demo.services.Imtl.user1;

@RestController
@RequestMapping("/user")
public class user {
	
	@Autowired
	private userServices UserServices;
	private userServices userSerivces;

	@GetMapping("/all")
	public List<userDomain>  alluser() {
		
		return UserServices.findAllUsers() ;
	}
	
	@PostMapping("/add")
	public String addUser(@RequestBody userDomain Userdata) {
		
		return userSerivces.saveUser(Userdata) ;
	}
	
	@PostMapping("/update")
	public String updateUser(@RequestBody userDomain newuserData) {
		return userServices.updateUser(newuserData); 
		
	}
}
 