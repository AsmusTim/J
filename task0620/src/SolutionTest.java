import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getMaxTest1() {
        assertEquals(3, Solution.getMax(2, 3));
    }
    @Test
    public void getMaxTest2() {
        assertEquals(9, Solution.getMax(9, -3421));
    }
    @Test
    public void getMaxTest3() {
        assertEquals(23, Solution.getMax(23, 23));
    }
}