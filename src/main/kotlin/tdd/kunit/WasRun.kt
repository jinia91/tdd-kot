package tdd.kunit

class WasRun(
    name: String,
    var wasRun: Boolean = false,
) : TestCase(name){
    fun testMethod(){
        wasRun = true
    }
}