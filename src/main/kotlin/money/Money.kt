package money

data class Money private constructor(
    val amount: Int,
    val currency: CurrencyCode
) {
    companion object {
        fun dollar(amount : Int) : Money = Money(amount, CurrencyCode.DOLLAR)
        fun won(amount: Int) : Money = Money(amount, CurrencyCode.WON)
    }
    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

}