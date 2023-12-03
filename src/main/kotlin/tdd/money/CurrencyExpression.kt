package tdd.money

interface CurrencyExpression{
    fun reduce(bank : Bank,to: String): Money

    operator fun plus(addend: CurrencyExpression): CurrencyExpression = Sum(this, addend)
}

class Sum(private val augend: CurrencyExpression, private val addend: CurrencyExpression) : CurrencyExpression {
    override fun reduce(bank: Bank, to: String): Money {
        val amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
        return Money(amount, to)
    }
}