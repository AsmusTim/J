import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1() {
        assertEquals(7, Solution.closeToTen(7, 2));
    }
    @Test
    public void test2() {
        assertEquals(100, Solution.closeToTen(10000, 100));
    }
    @Test
    public void test3() {
        assertEquals(5, Solution.closeToTen(5, 5));
    }
}