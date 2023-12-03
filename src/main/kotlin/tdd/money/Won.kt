package tdd.money

class Won(
    amount: Int
) : Money(amount, "KRW") {
    override fun times(multiplier: Int): Money = Money(amount * multiplier, this.currency)
}
