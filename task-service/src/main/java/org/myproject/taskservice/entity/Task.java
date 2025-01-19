package org.myproject.taskservice.entity;

import jakarta.persistence.*;
import org.myproject.taskservice.shared.constant.TaskStatus;

/**
 * @author nguyenle
 * @since 2:50 PM Sun 1/19/2025
 */
@Entity
@Table(
        name = "t_task"
)
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long userId;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

}
