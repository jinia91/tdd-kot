package tdd.kunit

class WasRun(
    name: String,
    val log: MutableList<String> = mutableListOf()
) : TestCase(name){

    override fun setUp() {
        log += "setUp"
    }

    override fun tearDown() {
        log += "tearDown"
    }

    fun testMethod(){
        log += "testMethod"
    }
}