import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int actualRes = Calculator.add(2,3);
        assertEquals(5,actualRes);
    }

    @Test
    public void testDivide() {
        Exception e = assertThrows(IllegalArgumentException.class,() -> {
            Calculator.divide(2,0);
        });
    }
}