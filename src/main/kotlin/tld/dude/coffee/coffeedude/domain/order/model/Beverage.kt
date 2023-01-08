package tld.dude.coffee.coffeedude.domain.order.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany
import java.math.BigDecimal

@Entity
class Beverage(
    val name: String,
    val cost: BigDecimal,
    @ManyToMany
    val ingredients: ArrayList<Ingredient>,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
) {

    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
    }

}
