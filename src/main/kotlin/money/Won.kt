package money

@JvmInline
value class Won (
    private val amount: Int
): Money {
    override fun times(multiplier: Int): Money {
        return Won(this.amount * multiplier)
    }
}