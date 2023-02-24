package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {
	@Autowired
	studentrepo repo;
	
	public user addUser(user user) {
		return repo.save(user);
	}
	
	public List<user> showUser(){
		return repo.findAll();
	}
	
	public String deleteUser(int id) {
		repo.deleteById(id);
		return "User " + id + "Deleted";
	}	
}