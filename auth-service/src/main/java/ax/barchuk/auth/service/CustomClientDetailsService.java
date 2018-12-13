package ax.barchuk.auth.service;

import ax.barchuk.auth.domain.ClientData;
import ax.barchuk.auth.domain.prop.ClientProp;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Primary
@Service
@RequiredArgsConstructor
public class CustomClientDetailsService implements ClientDetailsService {

    private final ClientProp clientProp;

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        final Optional<ClientData> clientData = clientProp.getClients().stream()
                .filter(client -> client.getName().equals(clientId))
                .findFirst();

        if (!clientData.isPresent()) {
            return null;
        }

        final ClientData client = clientData.get();
        final BaseClientDetails clientDetails = new BaseClientDetails();
        clientDetails.setClientId(client.getName());
        clientDetails.setClientSecret(client.getPassword());
        clientDetails.setAuthorizedGrantTypes(client.getGrantTypes());
        clientDetails.setScope(client.getScopes());

        return clientDetails;
    }
}
