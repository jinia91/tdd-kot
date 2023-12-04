package tdd.kunit

class TestCaseTests(testName: String) : TestCase(testName) {
    private lateinit var test: WasRun

    override fun setUp() {}

    override fun tearDown() {}

    fun `테스트케이스템플릿이 정상동작한다`() {
        test = WasRun("testMethod")
        test.run()
        check(test.log.first() == "setUp") { "setUp이 먼저 실행되어야 합니다."}
        check(test.log.contains("testMethod")){ "testMethod가 실행되어야 합니다."}
        check(test.log.last() == "tearDown") { "tearDown이 마지막에 실행되어야 합니다."}
    }
}