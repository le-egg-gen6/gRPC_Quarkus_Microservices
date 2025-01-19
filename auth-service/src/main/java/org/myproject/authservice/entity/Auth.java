package org.myproject.authservice.entity;

import jakarta.persistence.*;

/**
 * @author nguyenle
 * @since 4:20 PM Sun 1/19/2025
 */
@Entity
@Table(
        name = "t_auth"
)
public class Auth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    private String salt;

    private String password;

    private String facebookId;

    private String googleId;

    private String githubId;

}
