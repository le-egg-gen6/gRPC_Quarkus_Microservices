package org.myproject.profileservice.config;

import io.quarkus.runtime.ApplicationConfig;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

/**
 * @author nguyenle
 * @since 3:47 PM Sun 1/19/2025
 */

@OpenAPIDefinition(
        tags = {
                @Tag(name = "profile", description = "Profile operation")
        },
        info = @Info(
                title = "Open API for Profile Service with Quarkus",
                version = "0.0.1",
                contact = @Contact(
                        name = "Le Nguyen Ngoc",
                        email = "nguyenle.workspace@gmail.com"
                ),
                license = @License(
                        name = "MIT",
                        url = "https://opensource.org/licenses/MIT"
                )
        )
)
public class SwaggerConfig extends ApplicationConfig {
}
