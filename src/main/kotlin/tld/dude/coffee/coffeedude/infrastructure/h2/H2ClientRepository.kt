package tld.dude.coffee.coffeedude.infrastructure.h2

import org.springframework.data.repository.CrudRepository
import tld.dude.coffee.coffeedude.domain.order.model.Client
import tld.dude.coffee.coffeedude.domain.order.repository.ClientRepository

interface H2ClientRepository: ClientRepository, CrudRepository<Client, Long> {
}
