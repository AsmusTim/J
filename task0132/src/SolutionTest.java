import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void shouldReturnCorrectValue() {
        assertEquals(1, Solution.sumDigitsInNumber(100), 0);
    }

    @Test
    public void shouldReturnZeroValue() {
        assertEquals(0, Solution.sumDigitsInNumber(000), 0);
    }
}