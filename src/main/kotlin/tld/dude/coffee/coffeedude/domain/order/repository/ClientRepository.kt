package tld.dude.coffee.coffeedude.domain.order.repository

import tld.dude.coffee.coffeedude.domain.order.model.Client

interface ClientRepository {

    fun save(order: Client)

    fun findById(id: Long): Client

    fun findAll(): List<Client>

}
