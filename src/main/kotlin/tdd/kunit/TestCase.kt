package tdd.kunit

abstract class TestCase(
    val name: String,
) {
    fun run(result: TestResult): TestResult {
        setUp()
        try {
            result.testStarted()
            val method = this::class.java.getMethod(name)
            method.invoke(this)
        } catch (e: Exception) {
            result.testFailed(e)
        }
        tearDown()
        return result
    }

    abstract fun setUp()

    abstract fun tearDown()
}