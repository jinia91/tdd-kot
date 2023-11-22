package tdd.money

abstract class Money(protected val amount: Int) {
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Money -> amount == other.amount  && javaClass == other.javaClass
            else -> false
        }
    }

    abstract fun times(multiplier: Int): Money

    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }
    }
}