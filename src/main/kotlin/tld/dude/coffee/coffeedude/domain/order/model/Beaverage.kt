package tld.dude.coffee.coffeedude.domain.order.model

import java.text.DecimalFormat

interface Beaverage {

    fun getName(): String

    fun getCost(): DecimalFormat

    fun getIngredients(): List<Ingredient>

    fun getSize(): CupSize

}