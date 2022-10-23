package money

@JvmInline
value class Dollar (
    private val amount: Int
): Money {
    override fun times(multiplier: Int): Money {
        return Dollar(this.amount * multiplier)
    }
}