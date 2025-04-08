package com.kasmoprav.employeetrack.serviceimpl;

import com.kasmoprav.employeetrack.dao.EmployeeRepository;
import com.kasmoprav.employeetrack.model.Employee;
import com.kasmoprav.employeetrack.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployess(Employee employee) {
        employee.setEmployeeId("KASMO" + employee.getEmployeeId());
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
}
