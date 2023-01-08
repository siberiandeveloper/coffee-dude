package tld.dude.coffee.coffeedude.domain.order.repository

import tld.dude.coffee.coffeedude.domain.order.model.Order

interface OrderRepository {

    fun save(order: Order)

    fun findById(id: Long): Order

    fun findAll(): List<Order>

}
