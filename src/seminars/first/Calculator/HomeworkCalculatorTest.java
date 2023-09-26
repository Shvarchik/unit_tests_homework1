package seminars.first.Calculator;

import seminars.first.Calculator.Calculator;
import static org.assertj.core.api.Assertions.*;
public class HomeworkCalculatorTest {
    public static void main(String[] args) {

        assertThat(Calculator.calculatingDiscount(100,50)).isEqualTo(50);

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(0,20))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(100,200))
                .isInstanceOf(ArithmeticException.class);


    }

}
