package ax.barchuk.auth.domain.prop;

import ax.barchuk.auth.domain.ClientData;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "app")
public class ClientProp {
    private List<ClientData> clients;
}
