package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService 
{	

	@Autowired
	StudentRepository repository;
	public String updateDetails(StudentModel stu)	
	{
		repository.save(stu);
		return "updated";
	}
	public String deleteDetails(int id)
	{
		repository.deleteById(id);
		return "Id deleted";
	}
}
