package org.myproject.taskservice.config;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

/**
 * @author nguyenle
 * @since 2:57 PM Sun 1/19/2025
 */
@OpenAPIDefinition(
        tags = {
                @Tag(name = "task", description = "Task operation")
        },
        info = @Info(
                title = "Open API for Task Service with Quarkus",
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
public class SwaggerConfig extends Application {
}
