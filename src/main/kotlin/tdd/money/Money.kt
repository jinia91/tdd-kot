package tdd.money

open class Money(protected val amount: Int, currency: String) {
    val currency: String = currency

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Money -> amount == other.amount  && javaClass == other.javaClass
            else -> false
        }
    }

    open fun times(multiplier: Int): Money? = null

    override fun toString(): String {
        return "Money(amount=$amount, currency='$currency')"
    }

    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }

        fun won(amount: Int): Won {
            return Won(amount)
        }
    }
}