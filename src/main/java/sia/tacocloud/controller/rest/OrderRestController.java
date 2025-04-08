package sia.tacocloud.controller.rest;

import org.springframework.web.bind.annotation.*;
import sia.tacocloud.model.TacoOrder;
import sia.tacocloud.service.OrderService;

@RestController
@RequestMapping(path = "/api/orders",
        produces = "application/json")
@CrossOrigin(origins = "http://tacocloud:8080")
public class OrderRestController {
    private final OrderService orderService;

    public OrderRestController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PutMapping(path = "/{orderId}", consumes = "application/json")
    public TacoOrder updateOrder(@PathVariable("orderId") Long orderId,
                                 @RequestBody TacoOrder order) {
        order.setId(orderId);
        return orderService.updateOrder(orderId, order);
    }
}
