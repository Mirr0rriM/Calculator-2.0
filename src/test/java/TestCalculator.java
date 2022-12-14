import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    void addition() throws Exception {
        assertEquals(2, calculator.addition(1, 1));
        assertEquals(1, calculator.subtraction(3, 2));
        assertEquals(6, calculator.multiplication(2, 3));
        assertEquals(5, calculator.division(10, 2));
    }
}
