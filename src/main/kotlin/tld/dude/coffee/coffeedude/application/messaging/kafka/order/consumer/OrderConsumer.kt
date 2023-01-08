package tld.dude.coffee.coffeedude.application.messaging.kafka.order.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import tld.dude.coffee.coffeedude.domain.order.model.Order
import tld.dude.coffee.coffeedude.domain.order.service.OrderService

@Component
class OrderConsumer(private val orderService: OrderService) {

    @KafkaListener(topics = ["coffee-order"], groupId = "#kafkaProperty.group",
        containerFactory = "defaultFactory")
    fun consume(order: Order) {
        orderService.makeOrder(order)
    }

}
