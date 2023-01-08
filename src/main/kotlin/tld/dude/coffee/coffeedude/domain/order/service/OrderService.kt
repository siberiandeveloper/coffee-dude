package tld.dude.coffee.coffeedude.domain.order.service

import tld.dude.coffee.coffeedude.domain.order.model.Order
import tld.dude.coffee.coffeedude.domain.order.repository.OrderRepository

class OrderService(private val orderRepository: OrderRepository) {

    fun makeOrder(order: Order): Order {
        orderRepository.save(order)
        return order
    }

    fun getAll(): List<Order> {
        return orderRepository.findAll()
    }

}
