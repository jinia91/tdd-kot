package tdd.kunit

abstract class TestCase(
    val name: String,
) {
    fun run(): TestResult {
        val test = TestResult()
        setUp()
        test.testStarted()
        val method = this::class.java.getMethod(name)
        method.invoke(this)
        tearDown()
        return test
    }

    abstract fun setUp()

    abstract fun tearDown()
}