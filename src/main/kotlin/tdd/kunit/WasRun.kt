package tdd.kunit

class WasRun(
    val name: () -> Unit,
    var wasRun: Boolean = false,
){
    fun testMethod(){
        wasRun = true
    }
}