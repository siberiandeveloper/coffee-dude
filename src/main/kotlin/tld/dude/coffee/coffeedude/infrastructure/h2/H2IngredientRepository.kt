package tld.dude.coffee.coffeedude.infrastructure.h2

import org.springframework.data.repository.CrudRepository
import tld.dude.coffee.coffeedude.domain.order.model.Ingredient
import tld.dude.coffee.coffeedude.domain.order.repository.IngredientRepository

interface H2IngredientRepository: IngredientRepository, CrudRepository<Ingredient, Long> {
}
