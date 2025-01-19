package org.myproject.profileservice.entity;

import jakarta.persistence.*;
import org.myproject.profileservice.shared.constant.GenderConstant;
import org.myproject.profileservice.shared.constant.RoleConstant;
import org.myproject.profileservice.shared.constant.StatusConstant;

/**
 * @author nguyenle
 * @since 3:42 PM Sun 1/19/2025
 */
@Entity
@Table(
        name = "t_user_profile"
)
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private GenderConstant gender;

    private RoleConstant role;

    private StatusConstant status;

}
