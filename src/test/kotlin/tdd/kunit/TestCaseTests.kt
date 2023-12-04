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

    fun `테스트를 수행하고나면 테스트 결과를 확인 할 수 있다`() {
        test = WasRun("testMethod")
        val result = test.run()
        check(result.run == 1) { "테스트 결과가 다릅니다."}
        check(result.fail == 0) { "테스트 결과가 다릅니다."}
        check(result.summary() == "1 run, 0 failed") { "테스트 결과가 다릅니다."}
    }

    fun `실패하는 테스트를 수행하고나면 테스트 결과를 확인 할 수 있다`() {
        test = WasRun("testBrokenMethod")
        val result = test.run()
        check(result.run == 1) { "테스트 결과가 다릅니다."}
        check(result.fail == 1) { "테스트 결과가 다릅니다."}
        check(result.summary() == "1 run, 1 failed") { "테스트 결과가 다릅니다."}
    }
}