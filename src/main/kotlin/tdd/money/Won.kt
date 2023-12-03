package tdd.money

class Won(amount: Int) : Money(amount) {
    override fun times(multiplier: Int): Money = Won(amount * multiplier)
}
