package com.kasmoprav.employeetrack.dao;

import com.kasmoprav.employeetrack.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
