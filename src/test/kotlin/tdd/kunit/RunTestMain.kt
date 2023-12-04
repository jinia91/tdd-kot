package tdd.kunit

fun main() {
    val test = TestCaseTests("테스트케이스를 run 하면 wasRun이 된다") // 테스트 케이스 생성
    val test2 = TestCaseTests("테스트케이스를 setUp 하면 새로 세팅된다") // 테스트 케이스 생성
    test.run()   // 테스트 케이스 실행
    test2.run()   // 테스트 케이스 실행
    // 결과 확인
}