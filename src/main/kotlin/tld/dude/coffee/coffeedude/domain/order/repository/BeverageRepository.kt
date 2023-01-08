package tld.dude.coffee.coffeedude.domain.order.repository

import tld.dude.coffee.coffeedude.domain.order.model.Beverage

interface BeverageRepository {

    fun save(order: Beverage)

    fun findById(id: Long): Beverage

    fun findAll(): List<Beverage>

}
