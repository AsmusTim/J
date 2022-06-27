import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1() {
        assertEquals(2, Solution.max(1, 2));
    }
    @Test
    public void test2() {
        assertEquals(3, Solution.max(3, 2));
    }
    @Test
    public void test3() {
        assertEquals(4, Solution.max(4, 4));    }
}