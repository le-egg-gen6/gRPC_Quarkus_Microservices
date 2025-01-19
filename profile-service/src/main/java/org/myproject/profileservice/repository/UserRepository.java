package org.myproject.profileservice.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.myproject.profileservice.entity.UserProfile;

/**
 * @author nguyenle
 * @since 3:44 PM Sun 1/19/2025
 */
@ApplicationScoped
public class UserRepository implements PanacheRepository<UserProfile> {
}
