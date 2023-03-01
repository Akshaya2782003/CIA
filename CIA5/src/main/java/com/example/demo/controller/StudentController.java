package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepository;

@RestController
public class StudentController 
{
	@Autowired
	StudentRepository serviceRepository;
	
	@GetMapping("/get")
	List<StudentModel> getList()
	{
		return serviceRepository.findAll();
	}
	
	@PostMapping("/post")
	public StudentModel create(@RequestBody StudentModel stut)
	{
		return serviceRepository.save(stut);
	}
	
}
