package com.example.demo.services.Imtl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.userDomain;
import com.example.demo.repository.userRepository;
import com.example.demo.services.userServices;


@Service
public class user1  implements userServices {
	
	@Autowired
	private userRepository UserRepository;

	@Override
	public List<userDomain> findAllUsers() {
		// TODO Auto-generated method stub
		List<userDomain> allUsers = UserRepository.findAll();
		
		return allUsers;
	}
	
   @Override
   public String saveUser(userDomain userdata) {
	   
	 UserRepository.save(userdata);
	 return "data saved";
   }
   
   public String updateUser(userDomain newuserData) {
	 String msg = null;
	 if(newuserData.getId() !=null) {
		 UserRepository.save(newuserData);
		 msg ="data updated";
		 
	 }else {
		 
		 msg ="error";
	 }
	 
	 return msg;
		 
	   
   }
   
}