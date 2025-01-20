package org.myproject.authservice.config.open_id.google;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperties;
import org.myproject.authservice.config.open_id.shared.OpenIDConfigProps;

/**
 * @author nguyenle
 * @since 10:02 AM Mon 1/20/2025
 */
@ApplicationScoped
public class OidcGoogleConfig {

	@ConfigProperties(prefix = "google")
	OpenIDConfigProps configProps;

}
