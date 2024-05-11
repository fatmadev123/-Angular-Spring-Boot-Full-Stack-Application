package com.fatma.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatma.springboot.model.Employee;
import com.fatma.springboot.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//Get All Employees
	@GetMapping("employees")
	public List<Employee> getAllEmployee(){
		
		return employeeRepository.findAll();
		
	}

}
