package com.ntg.organization.organization.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.ntg.organization.organization.entity.Department;

import com.ntg.organization.organization.respository.DepartmentRepository;


@Service
public class DepartmentService  {

	
	@Autowired
	private DepartmentRepository DeoartmentRepository;
	
	
	public static List<Department> getAllDepartments() {
		return (List<Department>) DepartmentRepository.findAllDepartments();
	}
	
	
	
}
