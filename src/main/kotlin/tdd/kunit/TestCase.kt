package tdd.kunit

abstract class TestCase(
    val name: String,
) {
    fun run() {
        val method = this::class.java.getMethod(name)
        method.invoke(this)
    }
}