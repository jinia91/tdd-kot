package tdd.kunit

class WasRun(
    val name:String,
    var wasRun: Boolean = false,
){
    fun testMethod(){
        wasRun = true
    }
}