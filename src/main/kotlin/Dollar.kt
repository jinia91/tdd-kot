@JvmInline
value class Dollar(
    private val amount: Int
): Money {
    fun times(multiplier: Int): Dollar {
        return Dollar(this.amount * multiplier)
    }
}