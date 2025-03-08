package com.kasmoprav.employeetrack.controller;

import com.kasmoprav.employeetrack.dao.TaskRepository;
import com.kasmoprav.employeetrack.dto.TaskDTO;
import com.kasmoprav.employeetrack.model.Task;
import com.kasmoprav.employeetrack.service.TaskInterface;
import com.kasmoprav.employeetrack.serviceimpl.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskServiceImpl taskServiceIml;

    @Autowired
    TaskInterface taskService;

    @Autowired
    private TaskRepository repository;

    @PostMapping("/add")
    public String addTask(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) String dueDate,
            @RequestParam(required = false) String progress,
            @RequestParam(required = false) String details
    ) {
        Task taskDTO = new Task();
        taskDTO.setName(name);
        taskDTO.setDescription(description);
        taskDTO.setDueDate(dueDate);
        taskDTO.setAssignDate(LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
        taskDTO.setProgress(progress);
        taskDTO.setDetails(details);

        repository.save(taskDTO);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTaskDetails(@PathVariable long id){
        repository.deleteById(id);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String updateTask(@ModelAttribute Task task) {
        taskService.updateTask(task);
        return "redirect:/";
    }
}
