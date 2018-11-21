package ax.barchuk.pizzapporder.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderRequestDTO {

    private List<String> products;
    private String email;

}
