package tdd.kunit

fun main() {
    val testCase = TestCaseTests("테스트케이스템플릿이 정상동작한다")
    val testCase2 = TestCaseTests("테스트를 수행하고나면 테스트 결과를 확인 할 수 있다")
    testCase.run()
    testCase2.run()
    // 결과 확인
}