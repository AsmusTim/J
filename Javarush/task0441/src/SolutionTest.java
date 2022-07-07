import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void middleNumberTest1() {
        assertEquals(1, Solution.middleNumber(2, 1, 0));
    }
    @Test
    public void middleNumberTest2() {
        assertEquals(0, Solution.middleNumber(0, 0, 0));
    }
    @Test
    public void middleNumberTest3() {
        assertEquals(-6, Solution.middleNumber(2, -10, -6));
    }
    @Test
    public void middleNumberTest4() {
        assertEquals(209124, Solution.middleNumber(209124, 5312, 125125613));
    }
    @Test
    public void middleNumberTest5() {
        assertEquals(1, Solution.middleNumber(99, 1, -101));
    }
}