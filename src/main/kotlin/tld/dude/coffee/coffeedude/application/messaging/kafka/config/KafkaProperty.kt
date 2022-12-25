package tld.dude.coffee.coffeedude.application.messaging.kafka.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "kafka")
data class KafkaProperty(
    val host: String,
    val port: Int,
    val group: String
) {

    fun server(): String {
        return "$host:$port"
    }

}