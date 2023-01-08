package tld.dude.coffee.coffeedude.domain.order.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

@Entity
class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne
    val client: Client,
    @OneToMany
    val beverages: ArrayList<Beverage>,
    val size: CupSize,
) {

    fun addBeverage(beverage: Beverage) {
        beverages.add(beverage)
    }

}
