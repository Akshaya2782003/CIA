package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FamilyModel;
import com.example.demo.repository.FamilyRepository;

@RestController
public class FamilyController 
{
	@Autowired
	FamilyRepository serviceRepository;
	
	@GetMapping("/get")
	List<FamilyModel> getList()
	{
		return serviceRepository.findAll();
	}
}
