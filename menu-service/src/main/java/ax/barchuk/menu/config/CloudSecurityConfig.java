package ax.barchuk.menu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfiguration;

@Configuration
@EnableOAuth2Client
public class CloudSecurityConfig extends ResourceServerConfiguration {
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .mvcMatchers(HttpMethod.OPTIONS, "/**")
                .mvcMatchers(HttpMethod.GET, "/actuator/**");
    }
}
