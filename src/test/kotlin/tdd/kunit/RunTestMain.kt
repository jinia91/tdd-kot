package tdd.kunit

fun main() {
    val testCase = TestCaseTests("테스트케이스템플릿이 정상동작한다")
    testCase.run()
    val testCase2 = TestCaseTests("테스트를 수행하고나면 테스트 결과를 확인 할 수 있다")
    testCase2.run()
    val testCase3 = TestCaseTests("실패하는 테스트를 수행하고나면 테스트 결과를 확인 할 수 있다")
    testCase3.run()
}