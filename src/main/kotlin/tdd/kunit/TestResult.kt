package tdd.kunit

class TestResult(
    var run: Int = 0,
    var fail: Int = 0
){
    fun testStarted() {
        run++
    }

    fun summary(): String {
        return "$run run, $fail failed"
    }
}