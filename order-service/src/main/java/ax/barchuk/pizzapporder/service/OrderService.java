package ax.barchuk.pizzapporder.service;

import ax.barchuk.pizzapporder.domain.CombinedOrder;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    UUID createOrder(List<String> productNames, String email);

    CombinedOrder getById(String id);
}
