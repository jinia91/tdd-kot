package tdd.kunit

abstract class TestCase(
    val testCase: () -> Unit,
) {
    open fun run() {
        testCase()
    }
}