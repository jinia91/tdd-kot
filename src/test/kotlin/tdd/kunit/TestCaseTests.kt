package tdd.kunit

class TestCaseTests(testName: String) : TestCase(testName) {
    private lateinit var test: WasRun

    override fun setUp() {
        test = WasRun("testMethod")
    }

    fun `테스트케이스를 setUp 하면 새로 세팅된다`() {
        test.run()
        assert(test.wasSetUp)
    }

    fun `테스트케이스를 run 하면 wasRun이 된다`() {
        test.run()
        assert(test.wasRun)
    }
}