import io.kotest.core.spec.style.BehaviorSpec
import org.assertj.core.api.Assertions

class MoneyTests : BehaviorSpec() {
    /**
     * 1. 통화가 다른 두 금액을 더해서 주어진 환율에 맞게 변한 금액을 결과로 얻을 수 있어야 한다.
     *
     * 2. 어떤 금액(주가)을 어떤 수(주식의 수)에 곱한 금액을 결과로 얻을 수 있어야한다.
     */
    init {
        /**
         * 곱셈 연산 예시
         */
        Given("유효한 달러가 주어지면"){
            val five = Dollar(5)
            When("2를 곱할 때"){
                five.times(2)
                Then("두배가 된다") {
                    Assertions.assertThat(five.amount).isEqualTo(10)
                }
            }
        }
    }
}
