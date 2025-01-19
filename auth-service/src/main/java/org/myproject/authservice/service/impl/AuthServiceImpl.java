package org.myproject.authservice.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.myproject.authservice.repository.AuthRepository;
import org.myproject.authservice.service.AuthService;

/**
 * @author nguyenle
 * @since 4:25 PM Sun 1/19/2025
 */
@ApplicationScoped
public class AuthServiceImpl implements AuthService {

    private final AuthRepository authRepository;

    @Inject
    public AuthServiceImpl(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

}
