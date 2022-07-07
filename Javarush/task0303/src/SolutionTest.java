import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public static void test1(){
        assertEquals(13.64, Solution.convertEurToUsd(13), 0.1);
    }
    @Test
    public static void test2(){
        assertEquals(82.91, Solution.convertEurToUsd(79), 0.1);
    }
    @Test
    public static void test3(){
        assertEquals(54.57, Solution.convertEurToUsd(52), 0.1);
    }
    @Test
    public static void test4(){
        assertEquals(45.13, Solution.convertEurToUsd(43), 0.1);
    }
    @Test
    public static void test5(){
        assertEquals(4.20, Solution.convertEurToUsd(4), 0.1);
    }
}