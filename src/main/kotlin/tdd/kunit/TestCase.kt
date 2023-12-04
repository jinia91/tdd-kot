package tdd.kunit

abstract class TestCase(
    val name: String,
) {
    fun run() {
        setUp()
        val method = this::class.java.getMethod(name)
        method.invoke(this)
    }

    abstract fun setUp()
}