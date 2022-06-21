import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void shouldReturnCorrectValue() {
        assertEquals(1, Solution.getMetreFromCentimetre(100), 0);
    }

    @Test
    public void shouldReturnZeroValue() {
        assertEquals(0, Solution.getMetreFromCentimetre(0), 0);
    }

    @Test
    public void shouldReturnFloatValue() {
        assertEquals(1, Solution.getMetreFromCentimetre(105), 0.000001);
    }

    @org.junit.jupiter.api.Test
    void getMetreFromCentimetre() {
    }
}