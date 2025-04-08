package com.kasmoprav.employeetrack.serviceimpl;

import com.kasmoprav.employeetrack.dao.TaskRepository;
import com.kasmoprav.employeetrack.dto.TaskDTO;
import com.kasmoprav.employeetrack.mapper.TaskMapper;
import com.kasmoprav.employeetrack.model.Task;
import com.kasmoprav.employeetrack.service.TaskInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskInterface {

    @Autowired
    private TaskRepository repository;

    @Autowired
    private TaskMapper mapper;

    @Override
    public TaskDTO saveTask(TaskDTO taskDTO) {
        return mapper.toDTO(repository.save(mapper.toEntity(taskDTO)));
    }
    @Override
    public List<TaskDTO> getTasks() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public void updateTask(Task task) {
        Task existingTask = repository.findById(task.getId()).orElseThrow(
                () -> new IllegalArgumentException("Invalid task ID"));
        existingTask.setName(task.getName());
        existingTask.setDescription(task.getDescription());
        existingTask.setAssignDate(task.getAssignDate());
        existingTask.setDueDate(task.getDueDate());
        existingTask.setProgress(task.getProgress());
        existingTask.setDetails(task.getDetails());

        repository.save(existingTask);
    }
}
