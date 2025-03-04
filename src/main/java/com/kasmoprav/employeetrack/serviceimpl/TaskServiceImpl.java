package com.kasmoprav.employeetrack.serviceimpl;

import com.kasmoprav.employeetrack.dao.TaskRepository;
import com.kasmoprav.employeetrack.dto.TaskDTO;
import com.kasmoprav.employeetrack.mapper.TaskMapper;
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
}
