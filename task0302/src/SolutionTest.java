import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public static void test1(){
        assertEquals(true, Solution.printString("Hi"));
    }
    @Test
    public static void test2(){
        assertEquals(true, Solution.printString("I'm string"));
    }
}