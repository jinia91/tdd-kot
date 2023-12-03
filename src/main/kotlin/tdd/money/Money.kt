package tdd.money

class Money(val amount: Int, val currency: String) : CurrencyExpression {

    fun times(multiplier: Int): Money = Money(amount * multiplier, this.currency)

    operator fun plus(addend: Money): Sum = Sum(this, addend)

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Money -> amount == other.amount  && currency == other.currency // class가 아니라 화폐로 체크
            else -> false
        }
    }


    override fun toString(): String {
        return "Money(amount=$amount, currency='$currency')"
    }

    override fun hashCode(): Int {
        var result = amount
        result = 31 * result + currency.hashCode()
        return result
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }

        fun won(amount: Int): Money {
            return Money(amount, "KRW")
        }
    }
}