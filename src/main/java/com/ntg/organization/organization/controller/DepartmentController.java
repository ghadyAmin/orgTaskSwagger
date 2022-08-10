package com.ntg.organization.organization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntg.organization.organization.entity.Department;
import com.ntg.organization.organization.entity.Employee;
import com.ntg.organization.organization.respository.DepartmentRepository;
import com.ntg.organization.organization.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService DeoartmentService;
	
	
	@GetMapping(value = "/all")
	public List<Department> getAllDepartments() {
		return DepartmentService.getAllDepartments();
	}

}
