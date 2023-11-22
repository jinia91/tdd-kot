package tdd.money

class Dollar(amount: Int) : Money(amount) {
    fun times(multiplier: Int) = Dollar(amount * multiplier)
}
