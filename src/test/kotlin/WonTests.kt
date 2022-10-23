import money.Money
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

/*
   ( )1. $5 + ₩1000 = (환율에따라 $1 = ₩1000) ₩6000
   (v)2. ₩5 * ₩2 = ₩20
   ( )3. amount 를 private으로 만들기
   (v)4. ₩ 부작용? = value class 사용! value object pattern! + equals, hashcode, nullable 모두 언어적 차원에서 해결가능!
   ( )5. money.Won 반올림?
 */
class `통화가 다른 두 금액을 더해서 주어진 환율에 맞게 변한 금액을 결과로 얻을수 있어야한다` {

    @Test
    fun `(2) ₩5 * ₩2 = ₩20, (4) value object 패턴으로 기존 객체 불변성`() {
        // given
        val fiveWon = Money.won(5)
        // when
        val tenWon = fiveWon.times(2)
        // then
        assertThat(tenWon).isEqualTo(Money.won(10))
        // (4) value object 패턴으로 기존 객체 불변성
        assertThat(fiveWon).isEqualTo(Money.won(5))
    }

    @Test
    fun `같은 통화 연산 테스트`() {
        //given
        val hundredWon = Money.won(100)
        // when
        val fourHundredWon : Money = hundredWon.plus(Money.won(300))
        // then
        assertThat(fourHundredWon).isEqualTo(Money.won(400))
    }

    @Test
    fun `다른 통화 연산 테스트`() {
        //given
        val hundredWon = Money.won(100)
        // when
        val fourHundredWon : Money = hundredWon.plus(Money.dollar(3))
        // then
        assertThat(fourHundredWon).isEqualTo(Money.won(400))
        assertThat(fourHundredWon).isEqualTo(Money.dollar(4))
    }
}

class `어떤 금액(주가)을 어떤 수(주식의 수)에 곱한 금액을 결과로 얻을수 있어야 한다` {

}