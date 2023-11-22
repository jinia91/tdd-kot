package tdd.money

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
         * - 곱셈 연산 예시
         * - Dollar 부작용
         */
        Given("유효한 달러가 주어지고"){
            val five = Dollar(5)
            When("2를 곱할 때"){
                var product = five.times(2)
                Then("두배가 된다") {
                    Assertions.assertThat(product.amount).isEqualTo(10)
                }
                And("그리고 3을 곱할 때"){
                    product = five.times(3)
                    Then("세배가 된다") {
                        Assertions.assertThat(product.amount).isEqualTo(15)
                    }
                }
            }
        }
        /**
         * - equeals()
         * - not equals()
         */
        Given("유효한 달러가 셋 주어지고"){
            val a = Dollar(5)
            val b = Dollar(5)
            val c = Dollar(6)
            When("비교할 때"){
                Then("같은 값끼리는 같다") {
                    Assertions.assertThat(a).isEqualTo(b)
                }
                Then("다른 값끼리는 다르다") {
                    Assertions.assertThat(a).isNotEqualTo(c)
                    Assertions.assertThat(b).isNotEqualTo(c)
                }

            }
        }
    }
}
