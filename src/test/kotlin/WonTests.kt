import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

/*
   1. $5 + ₩1000 = (환율에따라 $1 = ₩1000) ₩6000
   2. ₩5 * ₩2 = ₩20
   3. amount 를 private으로 만들기
   4. ₩ 부작용?
   5. Won 반올림?
 */
class `통화가 다른 두 금액을 더해서 주어진 환율에 맞게 변한 금액을 결과로 얻을수 있어야한다` {

    @Test
    fun `2 ₩5 * ₩2 = ₩20`() {
        val fiveWon = Won(5)
        val tenWon : Won = fiveWon.times(2)
        assertThat(tenWon).isEqualTo(Won(10))
    }
}