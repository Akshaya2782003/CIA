package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AddressModel;
import com.example.demo.repository.AddressRepository;

@RestController
public class AddressController
{
	@Autowired
	AddressRepository serviceRepository;
	
	@GetMapping("/get")
	List<AddressModel> getList()
	{
		return serviceRepository.findAll();
	}
    
}