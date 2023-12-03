package tdd.money


class Bank {
    fun reduce(source: CurrencyExpression, to: String): Money {
        val sum = source as Sum
        val amount = sum.augend.amount + sum.addend.amount
        return Money(amount, to)
    }
}