package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired(required =true)
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public ResponseEntity<Employee>saveStudent(@RequestBody Employee employee){
		
		Employee employee1 = employeeService.saveEmployee(employee);
		
		return ResponseEntity.ok().body(employee1);
		
	}

}
