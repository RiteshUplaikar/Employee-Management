package com.kasmoprav.employeetrack.mapper;

import com.kasmoprav.employeetrack.dto.TaskDTO;
import com.kasmoprav.employeetrack.model.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    // Convert Task entity to TaskDTO
    TaskDTO toDTO(Task task);

    // Convert TaskDTO to Task entity
    Task toEntity(TaskDTO taskDTO);

    // Convert List<Task> to List<TaskDTO>
    List<TaskDTO> toDTOList(List<Task> taskList);

    // Convert List<TaskDTO> to List<Task> (optional, useful for batch operations)
    List<Task> toEntityList(List<TaskDTO> taskDTOList);
}
