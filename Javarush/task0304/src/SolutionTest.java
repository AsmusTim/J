import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public static void simpleTest1(){
        assertEquals(11, Solution.addTenPercent(10), 0.01);
    }
    @Test
    public static void simpleTest2(){
        assertEquals(14.3, Solution.addTenPercent(13), 0.01);
    }
    @Test
    public static void simpleTest3(){
        assertEquals(23.1, Solution.addTenPercent(21), 0.01);
    }
    @Test
    public static void simpleTest4(){
        assertEquals(63.8, Solution.addTenPercent(58), 0.01);
    }
    @Test
    public static void floatTest1(){
        assertEquals(63.69, Solution.addTenPercent(57.9), 0.01);
    }
    @Test
    public static void floatTest2(){
        assertEquals(1359519.65, Solution.addTenPercent(1235926.958), 0.01);
    }
    @Test
    public static void floatTest3(){
        assertEquals(0.004367, Solution.addTenPercent(0.00397), 0.01);
    }
    @Test
    public static void floatTest4(){
        assertEquals(0.22, Solution.addTenPercent(0.2), 0.01);
    }
    @Test
    public static void floatTest5(){
        assertEquals(0.0353171951, Solution.addTenPercent(0.032104560987), 0.01);
    }
}