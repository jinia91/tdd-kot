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
         * - tdd.money.Dollar 부작용
         */
        Given("유효한 달러가 주어지고") {
            val five : Money = Money.dollar(5)
            When("2를 곱할 때") {
                var product = five.times(2)
                Then("두배가 된다") {
                    Assertions.assertThat(product).isEqualTo(Money.dollar(10))
                }
                And("그리고 3을 곱할 때") {
                    product = five.times(3)
                    Then("세배가 된다") {
                        Assertions.assertThat(product).isEqualTo(Money.dollar(15))
                    }
                }
            }
        }
        /**
         * - equeals()
         * - not equals()
         */
        Given("유효한 달러가 셋 주어지고") {
            val a = Money.dollar(5)
            val b = Money.dollar(5)
            val c = Money.dollar(6)
            When("비교할 때") {
                Then("같은 값끼리는 같다") {
                    Assertions.assertThat(a).isEqualTo(b)
                }
                Then("다른 값끼리는 다르다") {
                    Assertions.assertThat(a).isNotEqualTo(c)
                    Assertions.assertThat(b).isNotEqualTo(c)
                }

            }
        }

        /**
         * - Won 화폐
         * - won 화폐 곱셈 연산
         */
        Given("유효한 원화가 주어지고") {
            val five = Money.won(5)
            When("2를 곱할 때") {
                var product = five.times(2)
                Then("두배가 된다") {
                    Assertions.assertThat(product).isEqualTo(Money.won(10))
                }
                And("그리고 3을 곱할 때") {
                    product = five.times(3)
                    Then("세배가 된다") {
                        Assertions.assertThat(product).isEqualTo(Money.won(15))
                    }
                }
            }
        }

        /**
         * - Won 화폐 equals()
         */
        Given("유효한 원화가 셋 주어지고") {
            val a = Money.won(5)
            val b = Money.won(5)
            val c = Money.won(6)
            When("비교할 때") {
                Then("같은 값끼리는 같다") {
                    Assertions.assertThat(a).isEqualTo(b)
                }
                Then("다른 값끼리는 다르다") {
                    Assertions.assertThat(a).isNotEqualTo(c)
                    Assertions.assertThat(b).isNotEqualTo(c)
                }
            }
        }

        /**
         * - Dollar와 Won 비교
         */
        Given("유효한 달러와 원화가 주어지고") {
            val dollar = Money.dollar(5)
            val won = Money.won(5)
            When("비교할 때") {
                Then("같은 값끼리는 다르다") {
                    Assertions.assertThat(dollar).isNotEqualTo(won)
                }
            }
        }

        /**
         *  - 통화 개념
         */
        Given("유효한 달러와 원화가 각각 주어지고") {
            val dollar = Money.dollar(5)
            val won = Money.won(5)
            When("통화를 확인할 때") {
                Then("같은 값끼리는 같다") {
                    Assertions.assertThat(dollar.currency).isEqualTo("USD")
                    Assertions.assertThat(won.currency).isEqualTo("KRW")
                }
            }
        }

        /**
         * - 상위 클래스라면 값만 동등 비교
         */
        Given("유효한 달러와 유효한 화폐가 주어지고") {
            val dollar = Money.dollar(5)
            val money = Money(5, "USD")
            When("상위 클래스라면 값만 동등 비교") {
                Then("같은 값끼리는 같다") {
                    Assertions.assertThat(dollar).isEqualTo(money)
                }
            }
        }

        /**
         *  화폐 더하기 테스트
         */
        Given("달러 두개가 주어지고"){
            val five = Money.dollar(5)
            val ten = Money.dollar(10)

            When("더할 때"){
                val sum = five + ten
                Then("합은 15달러다"){
                    Assertions.assertThat(sum).isEqualTo(Money.dollar(15))
                }
            }
        }
    }
}
