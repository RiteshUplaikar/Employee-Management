package com.kasmoprav.employeetrack.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {
    private long id;
    private String description;
    private String details;
    private String progress;
    private String name;
    private String dueDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}

