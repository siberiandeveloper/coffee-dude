package tld.dude.coffee.coffeedude.infrastructure.h2

import org.springframework.data.repository.CrudRepository
import tld.dude.coffee.coffeedude.domain.order.model.Order
import tld.dude.coffee.coffeedude.domain.order.repository.OrderRepository

interface H2OrderRepository: OrderRepository, CrudRepository<Order, Long> {
}
