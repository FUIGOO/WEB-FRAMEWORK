package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class studentController {
	@Autowired
	private studentService stuservice;
	
	@PostMapping("/addStudent")
	public String postDetails(@RequestBody user s)
	{
		stuservice.addUser(s);
		return "Value Added";
		
	}
	
	@GetMapping("/getStudent")
	public List<user> getDetails()
	{
		
		return stuservice.showUser();
	}
}