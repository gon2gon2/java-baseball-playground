package calculator;

import calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculatorTest {

    private static Calculator calculator = new Calculator();



    @Test
    void test_calc(){
        assertThat(calculator.calc(1, "+", 1)).isEqualTo(2);
        assertThat(calculator.calc(5, "-", 3)).isEqualTo(2);
        assertThat(calculator.calc(1, "*", 2)).isEqualTo(2);
        assertThat(calculator.calc(4, "/", 2)).isEqualTo(2);
    }

    @Test
    void test_accumulate(){
        String[] values = {"1", "+", "1"};
        assertThat(calculator.accumulate(values)).isEqualTo(2);
    }

    //입력값의 순서에 따라 계산함
    @Test
    void test_sequential_calculation(){
        String[] values = {"1", "+", "2", "*", "2"};
        assertThat(calculator.accumulate(values)).isEqualTo(6);
    }


}