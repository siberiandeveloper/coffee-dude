package tld.dude.coffee.coffeedude.infrastructure.h2

import org.springframework.data.repository.CrudRepository
import tld.dude.coffee.coffeedude.domain.order.model.Beverage
import tld.dude.coffee.coffeedude.domain.order.repository.BeverageRepository

interface H2BeverageRepository: BeverageRepository, CrudRepository<Beverage, Long> {
}
