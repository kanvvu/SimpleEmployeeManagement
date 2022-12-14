package com.example.tutorial3.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.tutorial3.model.Employee;


public interface EmployeeService {
    List<Employee> getAllEmployees();

    void addNewEmployee(String firstName, String lastName, String email);

    void addNewEmployee(Employee employee);

    Employee getEmployeeByID(long id);

    Boolean deleteEmployee(long id);

    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
