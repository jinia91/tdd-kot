package tdd.money

class Dollar(
    amount: Int,
    override val currency: String = "USD"
) : Money(amount) {
    override fun times(multiplier: Int) : Money = Dollar(amount * multiplier)
}
