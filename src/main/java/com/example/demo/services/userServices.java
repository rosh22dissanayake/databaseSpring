package com.example.demo.services;

import java.util.List;

import com.example.demo.domain.userDomain;

public interface userServices {

	List<userDomain> findAllUsers();
	
String saveUser	(userDomain userdata);

 static String updateUser(userDomain newuserData) {
	return null;
	// TODO Auto-generated method stub
	
}
} 