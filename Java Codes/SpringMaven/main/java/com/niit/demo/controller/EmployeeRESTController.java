package com.niit.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.demo.model.EmployeeListVO;
import com.niit.demo.model.EmployeeVO;

@RestController
public class EmployeeRESTController 
{
	@RequestMapping(value = "/employees")
	public @ResponseBody EmployeeListVO getAllEmployees()
	{
		EmployeeListVO employees = new EmployeeListVO();
		EmployeeVO empOne = new EmployeeVO(1, "Loki", "Rajkumar", "lauki@gmail.com");
		EmployeeVO empTwo = new EmployeeVO(2, "Thor", "Rajkumar", "thoru@gmail.com");
		EmployeeVO empThree = new EmployeeVO(3, "Odin", "Raja", "odiBaba@gmail.com");
		
		employees.getEmployees().add(empOne);
		employees.getEmployees().add(empTwo);
		employees.getEmployees().add(empThree);
		
		return employees;
	}
	
	@RequestMapping(value = "/employees/{id}")
	@ResponseBody
	public ResponseEntity<EmployeeVO> getEmployeeByID (@PathVariable("id") int id)
	{
		if(id <= 3)		
			return new ResponseEntity<EmployeeVO>(getAllEmployees().getEmployees().get(id-1),HttpStatus.OK);		
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
}