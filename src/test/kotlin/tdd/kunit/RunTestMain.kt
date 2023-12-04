package tdd.kunit

fun main() {
    val test = WasRun("testMethod")
    println(test.wasRun)
    test.testMethod()
    println(test.wasRun)
}