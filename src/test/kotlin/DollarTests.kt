import money.Money
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test



// 테스트시 세부 구현체에 대한 의존을 없애면, 세부 구현체가 엄청나게 변경되도! 테스트는 문제없으며, 비즈니스로직도 안전하다는 의미가 된다!
class `달러 테스트` {

    @Test
    fun `달러 계산`() {
        // given
        val fiveDollar = Money.dollar(5)
        // when
        val tenDollar = fiveDollar.times(2)
        // then
        assertThat(tenDollar).isEqualTo(Money.dollar(10))
        // (4) value object 패턴으로 기존 객체 불변성
        assertThat(fiveDollar).isEqualTo(Money.dollar(5))
    }
}
