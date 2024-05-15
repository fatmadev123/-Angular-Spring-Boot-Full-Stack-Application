package com.fatma.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatma.springboot.model.Employee;
import com.fatma.springboot.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//Get All Employees
	@GetMapping("employees")
	public List<Employee> getAllEmployee(){
		
		return employeeRepository.findAll();
		
	}
	
	//create employee Rest api
	@PostMapping("employees")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return employeeRepository.save(employee);
	}

}
