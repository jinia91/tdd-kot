package tdd.money


class Bank(
    private val rates: MutableMap<Pair<String, String>, Int> = mutableMapOf()
) {
    fun reduce(source: CurrencyExpression, to: String): Money {
        if (source is Money) return source.reduce(this, to)
        val sum = source as Sum
        return sum.reduce(this, to)
    }

    fun rate(from: String, to: String): Int {
        return if (from == to) 1
        else rates[Pair(from, to)] ?: throw IllegalArgumentException("환율이 존재하지 않습니다.")
    }

    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from, to)] = rate
    }
}