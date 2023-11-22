package tdd.money

open class Money(protected val amount: Int) {
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Money -> amount == other.amount
            else -> false
        }
    }
}