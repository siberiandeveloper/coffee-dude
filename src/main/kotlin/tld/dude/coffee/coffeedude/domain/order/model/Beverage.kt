package tld.dude.coffee.coffeedude.domain.order.model

import java.math.BigDecimal

interface Beverage {

    fun getId(): Long

    fun getName(): String

    fun getCost(): BigDecimal

    fun getIngredients(): List<Ingredient>

    fun getSize(): CupSize

}
