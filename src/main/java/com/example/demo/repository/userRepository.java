package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.userDomain;

public interface userRepository extends JpaRepository<userDomain, Integer> {

	//get all user
	//findBy Id
	//delete
	//update
	//custom query
	
}
