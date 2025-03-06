package com.kasmoprav.employeetrack.controller;

import com.kasmoprav.employeetrack.dao.EmployeeRepository;
import com.kasmoprav.employeetrack.model.Employee;
import com.kasmoprav.employeetrack.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping ("/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("employee", new Employee());
        return "form";
    }

    @PostMapping("/addEmployee")
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeService.saveEmployess(employee);
        return "index";
    }

    @GetMapping("/employeeList")
    public String findAllEmployee(Model model){
        model.addAttribute("EmployeeList", employeeService.getAllEmployee());
        return "employee-list";
    }

    @GetMapping("/profile/{id}")
    public String showEmployeeProfile(@PathVariable Long id, Model model) {
        model.addAttribute("employee", employeeService.findEmployeeById(id));
        return "employee-profile";
    }
}

