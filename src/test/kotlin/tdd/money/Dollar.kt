package tdd.money

class Dollar(var amount: Int) {
    fun times(multiplier: Int) = Dollar(amount * multiplier)

    override fun equals(other: Any?): Boolean {
        return other is Dollar && amount == other.amount
    }
}
