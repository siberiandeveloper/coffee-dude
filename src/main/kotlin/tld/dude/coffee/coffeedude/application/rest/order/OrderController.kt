package tld.dude.coffee.coffeedude.application.rest.order

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import tld.dude.coffee.coffeedude.domain.order.model.Order
import tld.dude.coffee.coffeedude.domain.order.service.OrderService

@RestController
@RequestMapping("/order")
class OrderController(private val orderService: OrderService) {

    @GetMapping
    fun getAll(): List<Order> {
        return orderService.getAll()
    }

}
