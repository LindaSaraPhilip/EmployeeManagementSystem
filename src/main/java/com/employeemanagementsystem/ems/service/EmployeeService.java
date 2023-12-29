package com.employeemanagementsystem.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employeemanagementsystem.ems.model.Employee;

@Service
public interface EmployeeService {
	
List<Employee> getEmployees();
Employee getaEmpbyid(Long id);
Employee addaEmp(Employee emp);
void deleteEmpbyid(Long id);
Employee updateEmp(Employee emp);



}
