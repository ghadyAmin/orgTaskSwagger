package com.ntg.organization.organization.respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ntg.organization.organization.entity.Department;


@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long>{

	public Optional<Department> findById(Long id);

	public static List<Department> findAllDepartments() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
