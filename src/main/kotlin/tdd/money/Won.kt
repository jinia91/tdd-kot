package tdd.money

class Won(private val amount: Int) {
    fun times(multiplier: Int) = Won(amount * multiplier)

    override fun equals(other: Any?): Boolean {
        return other is Won && amount == other.amount
    }
}
