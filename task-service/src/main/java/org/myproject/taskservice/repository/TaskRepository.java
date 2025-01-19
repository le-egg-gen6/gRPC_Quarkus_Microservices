package org.myproject.taskservice.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.myproject.taskservice.entity.Task;

/**
 * @author nguyenle
 * @since 2:54 PM Sun 1/19/2025
 */
@ApplicationScoped
public class TaskRepository implements PanacheRepository<Task> {
}
