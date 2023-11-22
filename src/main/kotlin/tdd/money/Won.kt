package tdd.money

class Won(amount: Int) : Money(amount) {
    fun times(multiplier: Int): Money = Won(amount * multiplier)
}
