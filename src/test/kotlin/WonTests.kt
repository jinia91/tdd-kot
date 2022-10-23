import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class WonTests {

    @Test
    fun `통화가 다른 두 금액을 더해서 주어진 환율에 맞게 변한 금액을 결과로 얻을수 있어야한다`() {
        val fiveWon = Won(5)
        val tenWon : Won = fiveWon.times(2)
        assertThat(tenWon).isEqualTo(Won(10))
    }

    @Test
    fun `어떤 금액(주가)을 어떤 수(주식의 수)에 곱한 금액을 결과로 얻을 수 있어야 한다`() {

    }
}