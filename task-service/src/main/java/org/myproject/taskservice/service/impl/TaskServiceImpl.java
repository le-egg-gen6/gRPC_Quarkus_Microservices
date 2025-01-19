package org.myproject.taskservice.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.myproject.taskservice.repository.TaskRepository;
import org.myproject.taskservice.service.TaskService;

/**
 * @author nguyenle
 * @since 2:53 PM Sun 1/19/2025
 */
@ApplicationScoped
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Inject
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

}
