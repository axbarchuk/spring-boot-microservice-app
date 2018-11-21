package ax.barchuk.pizzapporder.service.impl;

import ax.barchuk.pizzapporder.domain.CombinedOrder;
import ax.barchuk.pizzapporder.domain.MenuItem;
import ax.barchuk.pizzapporder.feign.MenuFeignClient;
import ax.barchuk.pizzapporder.repository.OrderRepository;
import ax.barchuk.pizzapporder.service.OrderService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;
    private final MenuFeignClient menuFeignClient;

    @Override
    public UUID createOrder(List<String> productNames, String email) {
        final List<MenuItem> menuItems = productNames.stream()
                .map(menuFeignClient::get)
                .collect(Collectors.toList());

        final CombinedOrder combinedOrder = repository.save(new CombinedOrder(UUID.randomUUID(), menuItems, email));

        return combinedOrder.getId();
    }

    @Override
    public CombinedOrder getById(String id) {
        return repository.findById(UUID.fromString(id))
                .orElseThrow(() -> new IllegalArgumentException("Combined order doesn't found."));
    }
}
