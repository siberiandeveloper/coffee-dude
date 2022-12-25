package tld.dude.coffee.coffeedude.domain.order.model

enum class CupSize(private val ml: Int) {

    SMALL(120),
    REGULAR(240),
    MEDIUM(360),
    LARGE(430);

    fun getSize(): Int {
        return ml
    }

}
