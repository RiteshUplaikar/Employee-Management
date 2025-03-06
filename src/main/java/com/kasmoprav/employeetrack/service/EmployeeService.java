package com.kasmoprav.employeetrack.service;

import com.kasmoprav.employeetrack.dto.TaskDTO;
import com.kasmoprav.employeetrack.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    Employee saveEmployess(Employee employee);

    Employee findEmployeeById(Long id);
}
