package com.freelance.employee_management.service;

import com.freelance.employee_management.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Long id,Employee employee);
    void deleteEmployee(Long id);
}
