package com.kasmoprav.employeetrack.controller;

import com.kasmoprav.employeetrack.dao.TaskRepository;
import com.kasmoprav.employeetrack.dto.TaskDTO;
import com.kasmoprav.employeetrack.model.Task;
import com.kasmoprav.employeetrack.serviceimpl.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

@Controller
public class HomeController {
    @Autowired
    private TaskServiceImpl taskService;

    @Autowired
    private TaskRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        List<Task> tasks = repository.findAll();
        model.addAttribute("tasks", tasks);
        model.addAttribute("taskDTO", new TaskDTO()); // Correctly adding taskDTO
        return "index";
    }


    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
