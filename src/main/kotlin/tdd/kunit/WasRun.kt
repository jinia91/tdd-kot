package tdd.kunit

class WasRun(
    testCase: () -> Unit,
    var wasRun: Boolean = false,
) : TestCase(testCase){
    override fun run(){
        super.run()
        wasRun = true
    }
}