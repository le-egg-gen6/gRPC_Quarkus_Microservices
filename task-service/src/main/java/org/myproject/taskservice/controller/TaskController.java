package org.myproject.taskservice.controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.myproject.taskservice.service.TaskService;

/**
 * @author nguyenle
 * @since 2:55 PM Sun 1/19/2025
 */
@RequestScoped
@Path("/task")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

}
