package tdd.money

class Dollar(private val amount: Int) {
    fun times(multiplier: Int) = Dollar(amount * multiplier)

    override fun equals(other: Any?): Boolean {
        return other is Dollar && amount == other.amount
    }
}
