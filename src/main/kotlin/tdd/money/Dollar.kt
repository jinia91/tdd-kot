package tdd.money

class Dollar(
    amount: Int,
) : Money(amount,"USD") {
    override fun times(multiplier: Int) : Money =
        Money(amount * multiplier, this.currency)
}
