package tld.dude.coffee.coffeedude

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka
import tld.dude.coffee.coffeedude.application.messaging.kafka.config.KafkaProperty

@EnableKafka
@SpringBootApplication
@EnableConfigurationProperties(KafkaProperty::class)
class CoffeeDudeApplication

fun main(args: Array<String>) {
    runApplication<CoffeeDudeApplication>(*args)
}
