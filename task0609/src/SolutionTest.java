import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals(0, Solution.getDistance(1, 1, 1, 1), 0.01);
    }
    @Test
    public void test2(){
        assertEquals(5.09, Solution.getDistance(5, 2, 6, 7), 0.01);
    }
    @Test
    public void test3(){
        assertEquals(232.65, Solution.getDistance(234, 54, 7, 3), 0.01);
    }
    @Test
    public void test4(){
        assertEquals(26.9, Solution.getDistance(10, 9, -10, -9), 0.01);
    }
}