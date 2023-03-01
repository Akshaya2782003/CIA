package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@RestController
public class StudentController 
{
	@Autowired
	StudentRepository serviceRepository;
	@Autowired
	StudentService service;
	
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
	
	@PutMapping("/put")
	public String update(@RequestBody StudentModel stut)
	{
		return service.updateDetails(stut);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id)
	{
		return service.deleteDetails(id);
	}
}
