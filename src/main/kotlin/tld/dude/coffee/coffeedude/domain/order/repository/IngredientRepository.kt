package tld.dude.coffee.coffeedude.domain.order.repository

import tld.dude.coffee.coffeedude.domain.order.model.Ingredient

interface IngredientRepository {

    fun save(order: Ingredient)

    fun findById(id: Long): Ingredient

    fun findAll(): List<Ingredient>

}
