package org.myproject.authservice.shared;

import io.quarkus.mailer.Mailer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

/**
 * @author nguyenle
 * @since 4:39 PM Sun 1/19/2025
 */
@ApplicationScoped
public class MailService {

    private final ThreadPoolService threadPoolService;

    private final Mailer mailer;

    @Inject
    public MailService(
            ThreadPoolService threadPoolService,
            Mailer mailer
    ) {
        this.threadPoolService = threadPoolService;
        this.mailer = mailer;
    }



}
