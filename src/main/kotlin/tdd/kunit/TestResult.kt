package tdd.kunit

class TestResult(
    var run: Int = 0,
    var fail: Int = 0,
    var failLog: MutableList<String> = mutableListOf()
){
    fun testStarted() {
        run++
    }

    fun testFailed(e: Exception) {
        fail++
        failLog.add(e.message ?: e.toString())
    }

    fun summary(): String {
        return "$run run, $fail failed"
    }

    fun printFailLog() {
        failLog.forEach {
            println(it)
        }
    }
}