package ax.barchuk.pizzapporder.controller;

import ax.barchuk.pizzapporder.controller.dto.OrderRequestDTO;
import ax.barchuk.pizzapporder.domain.CombinedOrder;
import ax.barchuk.pizzapporder.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping("/combine")
    public CombinedOrder combineOrder(@RequestBody OrderRequestDTO requestDTO) {
        final UUID orderId = service.createOrder(requestDTO.getProducts(), requestDTO.getEmail());
        return service.getById(orderId.toString());
    }

    @GetMapping("/{uuid}")
    public CombinedOrder get(@PathVariable String uuid) {
        return service.getById(uuid);
    }

}
