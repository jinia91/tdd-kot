package tdd.money

class Won(
    amount: Int,
    override val currency: String = "KRW",
) : Money(amount) {
    override fun times(multiplier: Int): Money = Won(amount * multiplier)
}
