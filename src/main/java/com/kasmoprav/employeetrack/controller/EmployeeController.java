package com.kasmoprav.employeetrack.controller;

import com.kasmoprav.employeetrack.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class EmployeeController {
    @GetMapping ("/registration-form")
    public String showRegistrationForm(Model model){
        Employee employee = new Employee();
//        employee.setId(1L);
//        employee.setDesignation("designation");
//        employee.setAge(18);
//        employee.setAdharCardNo("123456789012");
//        employee.setPanCardNo("ABDO09PLA");
//        employee.setDob(new Date());
//        employee.setJoiningDate(LocalDateTime.now());
//        employee.setEmail("employee@kasmoprav.com");
//        employee.setGender("male");
//        employee.setName("John Depps");
        model.addAttribute("employee", employee);
        return "registration-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("employee", employee);
        return "display_form";
    }


}
