package tdd.money

class Money(val amount: Double, val currency: String) : CurrencyExpression {
    constructor(amount: Number, currency: String) : this(amount.toDouble(), currency)

    fun times(multiplier: Double): Money = Money(amount * multiplier, this.currency)

    operator fun plus(addend: Money): Sum = Sum(this, addend)
    override fun reduce(bank: Bank, to: String): Money {
        val rate = if (currency == "USD" && to == "KRW") 1000 else 1
        return Money(amount / rate, to)
    }

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
        return result.toInt()
    }

    companion object {
        fun dollar(amount: Number): Money {
            return Money(amount, "USD")
        }

        fun won(amount: Number): Money {
            return Money(amount, "KRW")
        }
    }
}