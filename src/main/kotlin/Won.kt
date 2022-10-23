@JvmInline
value class Won(
    val amount: Int
) {
    fun times(multiplier: Int): Won {
        return Won(this.amount * multiplier)
    }
}