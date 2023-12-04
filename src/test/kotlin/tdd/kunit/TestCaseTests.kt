package tdd.kunit

class TestCaseTests(testName: String) : TestCase(testName) {
    private lateinit var test: WasRun

    override fun setUp() {
    }

    fun `테스트케이스템플릿이 정상동작한다`() {
        test = WasRun("testMethod")
        test.run()
        assert(test.log.first() == "setUp")
        assert(test.log.contains("testMethod"))
    }
}