package tdd.money


class Bank {
    fun reduce(source: CurrencyExpression, to: String): Money {
        if (source is Money) return source.reduce(to)
        val sum = source as Sum
        return sum.reduce(this, to)
    }
}