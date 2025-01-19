package org.myproject.profileservice.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.myproject.profileservice.repository.UserRepository;
import org.myproject.profileservice.service.UserService;

/**
 * @author nguyenle
 * @since 3:45 PM Sun 1/19/2025
 */
@ApplicationScoped
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Inject
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
