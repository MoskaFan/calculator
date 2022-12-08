import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.junit.jupiter.api.Assertions.*;

class calculateTest {
@Test
    void when_add_2_double_numbers_then_result(){
    BigDecimal bd1 = new BigDecimal(0.3);
    BigDecimal bd2 = new BigDecimal(0.1);
    BigDecimal expected = bd1.add(bd2, MathContext.DECIMAL32);
    BigDecimal result = Calculate.add_2_double_numbers(bd1, bd2);
    assertEquals(expected, result);
}
@Test
    void when_abstract_2_double_numbers_then_result(){
        BigDecimal bd1 = new BigDecimal(0.3);
        BigDecimal bd2 = new BigDecimal(0.1);
        BigDecimal expected = bd1.subtract(bd2, MathContext.DECIMAL32);
        BigDecimal result = Calculate.abstract_2_double_numbers(bd1, bd2);
        assertEquals(expected, result);
    }
    @Test

    void when_multiply_2_double_numbers_then_result(){
        BigDecimal bd1 = new BigDecimal(0.3);
        BigDecimal bd2 = new BigDecimal(0.1);
        BigDecimal expected = bd1.multiply(bd2, MathContext.DECIMAL32);
        BigDecimal result = Calculate.multiply_2_double_numbers(bd1, bd2);
        assertEquals(expected, result);
    }
    @Test
    void when_divide_2_double_numbers_then_result(){
        BigDecimal bd1 = new BigDecimal(0.3);
        BigDecimal bd2 = new BigDecimal(0.1);
        double bd3 = 3.0;
        BigDecimal expected = bd1.divide(bd2, MathContext.DECIMAL32);
        BigDecimal result = Calculate.divide_2_double_numbers(bd1, bd2);
        assertEquals(expected, result);
    }
}