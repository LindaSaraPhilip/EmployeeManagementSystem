package com.employeemanagementsystem.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.employeemanagementsystem.ems.model.Employee;
import com.employeemanagementsystem.ems.service.EmployeeService;


@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/getEmployees")
	public String listEmployees(Model model)
	{
		model.addAttribute("employees",service.getEmployees());
		return "Employee";
	}
	@GetMapping("/Employee/new")
	public String addemployeesfromlink(Model model)
	{
		model.addAttribute("employees",service.getEmployees());
		return "create_employee";
	}
	
	@PostMapping("/Employee/new")
	public String addEmployee(@ModelAttribute Employee employee, Model model) {
		service.addaEmp(employee); // Save the new employee
		return "redirect:/getEmployees"; // Redirect to the listing page
	}
	@GetMapping("/getEmployees/edit/{id}")
	public String updateEmployeebylink(@PathVariable Long id, Model model) {
	    Employee employee = service.getaEmpbyid(id);
	    model.addAttribute("employee", employee);
	    return "update_employee";
	}	
	
	@PostMapping("/getEmployees/edit/{id}")
	public String updateEmployee(@PathVariable Long id ,@ModelAttribute("employee") Employee employee, Model model)
	{
		Employee existingEmp=service.getaEmpbyid(id);
		existingEmp.setFname(employee.getFname());
		existingEmp.setLname(employee.getLname());
		existingEmp.setSalary(employee.getSalary());
		existingEmp.setMobile(employee.getMobile());
		existingEmp.setDesignation(employee.getDesignation());
		existingEmp.setReportsto(employee.getReportsto());
		service.updateEmp(existingEmp);
		return "redirect:/getEmployees";
		
	}
	
	@GetMapping("/getEmployees/delete/{id}")
	public String deleteEmployee(@PathVariable Long id) {
	    service.deleteEmpbyid(id);
	    return "redirect:/getEmployees";
	}


}
