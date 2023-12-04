package tdd.kunit

fun main() {
    val test = WasRun({ "testMethod" }) // 테스트 케이스 생성
    println(test.wasRun)
    test.testMethod()   // 테스트 케이스 실행
    println(test.wasRun)
    // 결과 확인
}