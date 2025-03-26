package com.kasmoprav.employeetrack.service;

import com.kasmoprav.employeetrack.dto.TaskDTO;
import com.kasmoprav.employeetrack.model.Task;

import java.util.List;

public interface TaskInterface {

    TaskDTO saveTask(TaskDTO taskDTO);

    List<TaskDTO> getTasks();

    void updateTask(Task task);
}
