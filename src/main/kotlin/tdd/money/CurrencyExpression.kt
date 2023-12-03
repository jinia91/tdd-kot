package tdd.money

interface CurrencyExpression{
    fun reduce(bank : Bank,to: String): Money
}

class Sum(private val augend: Money, private val addend: Money) : CurrencyExpression {
    override fun reduce(bank: Bank, to: String): Money {
        val amount = augend.amount + addend.amount
        return Money(amount, to)
    }
}