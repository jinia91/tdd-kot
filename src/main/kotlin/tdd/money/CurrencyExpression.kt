package tdd.money

interface CurrencyExpression

class Sum(val augend: Money, val addend: Money) : CurrencyExpression