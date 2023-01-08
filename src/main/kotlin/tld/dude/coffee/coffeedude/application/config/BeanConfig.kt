package tld.dude.coffee.coffeedude.application.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import tld.dude.coffee.coffeedude.domain.order.repository.OrderRepository
import tld.dude.coffee.coffeedude.domain.order.service.OrderService

@Configuration
class BeanConfig(private val orderRepository: OrderRepository) {

    @Bean
    fun orderService(): OrderService {
        return OrderService(orderRepository)
    }

}
