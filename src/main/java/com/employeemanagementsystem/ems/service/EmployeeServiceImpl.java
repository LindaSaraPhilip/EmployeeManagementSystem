package com.employeemanagementsystem.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagementsystem.ems.model.Employee;
import com.employeemanagementsystem.ems.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public List<Employee> getEmployees() {
		
		return repo.findAll();
	}

	@Override
	public Employee getaEmpbyid(Long id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public Employee addaEmp(Employee emp) {
		
		return repo.save(emp);
	}

	@Override
	public void deleteEmpbyid(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Employee updateEmp(Employee emp) {
		
		return repo.save(emp);
	}

}
