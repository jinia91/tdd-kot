package tdd.kunit

fun main() {
    val result = TestResult()
    val suite = KUnitTestSuite()
    suite.add(TestCaseTests("테스트케이스템플릿이 정상동작한다"))
    suite.add(TestCaseTests("테스트를 수행하고나면 테스트 결과를 확인 할 수 있다"))
    suite.add(TestCaseTests("실패하는 테스트를 수행하고나면 테스트 결과를 확인 할 수 있다"))
    suite.add(TestCaseTests("suite 동작 테스트"))
    suite.run(result)
    println(result.summary())
    result.printFailLog()
}