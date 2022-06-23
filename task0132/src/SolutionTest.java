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
    @Test
    public void test1() {
        assertEquals(6, Solution.sumDigitsInNumber(123), 0);
    }
    @Test
    public void test2() {
        assertEquals(15, Solution.sumDigitsInNumber(159), 0);
    }
    @Test
    public void test3() {
        assertEquals(21, Solution.sumDigitsInNumber(579), 0);
    }
    @Test
    public void test4() {
        assertEquals(3, Solution.sumDigitsInNumber(111), 0);
    }
}