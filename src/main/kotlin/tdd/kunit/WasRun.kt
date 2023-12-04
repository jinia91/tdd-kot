package tdd.kunit

class WasRun(
    name: String,
    var wasRun: Boolean = false,
    var wasSetUp: Boolean = false,
    val log: MutableList<String> = mutableListOf()
) : TestCase(name){

    override fun setUp() {
        wasRun = false
        wasSetUp = true
        log += "setUp"
    }

    fun testMethod(){
        wasRun = true
    }
}