package org.myproject.authservice.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.myproject.authservice.entity.Auth;

/**
 * @author nguyenle
 * @since 4:24 PM Sun 1/19/2025
 */
@ApplicationScoped
public class AuthRepository implements PanacheRepository<Auth> {
}
