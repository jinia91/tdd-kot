@JvmInline
value class Won(
    private val amount: Int
): Money {
    fun times(multiplier: Int): Won {
        return Won(this.amount * multiplier)
    }
}