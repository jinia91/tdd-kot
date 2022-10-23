package money

interface Money {
    companion object {
        fun dollar(amount : Int) : Dollar = Dollar(amount)
        fun won(amount: Int) : Won = Won(amount)
    }
    fun times(multiplier: Int): Money


}