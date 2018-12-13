package ax.barchuk.auth.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ClientData {

    private String name;
    private String password;
    private List<String> scopes;
    private List<String> grantTypes;

}
