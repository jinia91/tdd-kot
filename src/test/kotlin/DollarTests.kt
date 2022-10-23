import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test


class `달러 테스트` {

    @Test
    fun `달러 계산`() {
        // given
        val fiveDollar = Dollar(5)
        // when
        val tenDollar : Dollar = fiveDollar.times(2)
        // then
        assertThat(tenDollar).isEqualTo(Dollar(10))
        // (4) value object 패턴으로 기존 객체 불변성
        assertThat(fiveDollar).isEqualTo(Dollar(5))
    }
}
