package tdd.kunit

class KUnitTestSuite(
    val tests: MutableList<TestCase> = mutableListOf()
) {
    fun add(test: TestCase) {
        tests.add(test)
    }

    fun run(result: TestResult): TestResult {
        tests.forEach {
            it.run(result)
        }
        return result
    }
}
