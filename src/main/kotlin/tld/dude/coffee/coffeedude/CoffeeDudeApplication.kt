package tld.dude.coffee.coffeedude

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoffeeDudeApplication

fun main(args: Array<String>) {
    runApplication<CoffeeDudeApplication>(*args)
}
