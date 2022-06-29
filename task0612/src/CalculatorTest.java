import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void plus() {
        assertEquals(2, Calculator.plus(1, 1));
    }

    @Test
    public void minus() {
        assertEquals(3, Calculator.minus(5, 2));
    }

    @Test
    public void multiply() {
        assertEquals(6, Calculator.multiply(2, 3));
    }

    @Test
    public void division() {
        assertEquals(1.5, Calculator.division(3, 2), 0.1);
    }

    @Test
    public void percent() {
        assertEquals(20, Calculator.percent(20, 100), 0.1);
    }
}