package tld.dude.coffee.coffeedude.domain.order.model

interface Order {

    fun getId(): Long

    fun getClient(): Client

    fun getBeverage(): Beverage

}
