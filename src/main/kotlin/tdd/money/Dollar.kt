package tdd.money

class Dollar(amount: Int) : Money(amount) {
    fun times(multiplier: Int) : Money = Dollar(amount * multiplier)
}
