package tdd.kunit

class TestCaseTests(testName: String) : TestCase(testName) {

    fun `테스트케이스를 run 하면 wasRun이 된다`() {
        val test = WasRun("testMethod")
        assert(!test.wasRun)
        test.run()
        assert(test.wasRun)
    }
}