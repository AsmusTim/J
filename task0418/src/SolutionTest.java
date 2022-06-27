import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1() {
        assertEquals(2, Solution.min(2, 3));
    }
    @Test
    public void test2() {
        assertEquals(3, Solution.min(3, 4));
    }
    @Test
    public void test3() {
        assertEquals(5, Solution.min(5, 5));
    }
}