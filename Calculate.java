import java.math.BigDecimal;
import java.math.MathContext;

public class Calculate {
    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(0.3);
        BigDecimal bd2 = BigDecimal.valueOf(0.1);

        BigDecimal result1 = add_2_double_numbers(bd1,bd2);
        BigDecimal result2 = abstract_2_double_numbers(bd1,bd2);
        BigDecimal result3 = multiply_2_double_numbers(bd1,bd2);
        BigDecimal result4 = divide_2_double_numbers(bd1,bd2);
        System.out.println("Summieren: " + result1 + ", Abstrahieren: " +result2+ ", Multiplizieren: " +result3+ ", Dividieren: " + result4);
    }

    public static BigDecimal add_2_double_numbers(BigDecimal bd1, BigDecimal bd2) {
        return bd1.add(bd2,MathContext.DECIMAL32);
    }
    public static BigDecimal abstract_2_double_numbers(BigDecimal bd1, BigDecimal bd2) {
        return bd1.subtract(bd2,MathContext.DECIMAL32);
    }
    public static BigDecimal multiply_2_double_numbers(BigDecimal bd1, BigDecimal bd2) {
        return bd1.multiply(bd2,MathContext.DECIMAL32);
    }
    public static BigDecimal divide_2_double_numbers(BigDecimal bd1, BigDecimal bd2) {
        return bd1.divide(bd2,MathContext.DECIMAL32);
    }


}
