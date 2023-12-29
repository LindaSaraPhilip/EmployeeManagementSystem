package com.employeemanagementsystem.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemanagementsystem.ems.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
