import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

/*
   ( )1. $5 + ₩1000 = (환율에따라 $1 = ₩1000) ₩6000
   (v)2. ₩5 * ₩2 = ₩20
   ( )3. amount 를 private으로 만들기
   (v)4. ₩ 부작용? = value class 사용! value object pattern!
   ( )5. Won 반올림?
 */
class `통화가 다른 두 금액을 더해서 주어진 환율에 맞게 변한 금액을 결과로 얻을수 있어야한다` {

    @Test
    fun `(2) ₩5 * ₩2 = ₩20`() {
        // given
        val fiveWon = Won(5)
        // when
        val tenWon : Won = fiveWon.times(2)
        // then
        assertThat(tenWon).isEqualTo(Won(10))
    }
}

class `어떤 금액(주가)을 어떤 수(주식의 수)에 곱한 금액을 결과로 얻을수 있어야 한다` {

}