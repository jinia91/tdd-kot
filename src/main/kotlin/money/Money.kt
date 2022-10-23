package money

interface Money {
    companion object {
        fun dollar(amount : Int) : Money = Dollar(amount)
        fun won(amount: Int) : Money = Won(amount)
    }
    fun times(multiplier: Int): Money


}