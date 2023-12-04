package tdd.kunit

class WasRun(
    name: String,
    val log: MutableList<String> = mutableListOf()
) : TestCase(name){

    override fun setUp() {
        log += "setUp"
    }

    fun testMethod(){
        log += "testMethod"
    }
}