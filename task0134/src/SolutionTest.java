import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void TestOnCorrectReturn1(){
        assertEquals(0, Solution.getVolume(0, 100, 1000), 0);
    }
    @Test
    public void TestOnCorrectReturn2(){
        assertEquals(2000, Solution.getVolume(1, 1, 2), 0);
    }
    @Test
    public void TestOnCorrectReturn3(){
        assertEquals(3000000, Solution.getVolume(3, 100, 10), 0);
    }
    @Test
    public void TestOnCorrectReturn4(){
        assertEquals(25000, Solution.getVolume(25, 1, 1), 0);
    }
    @Test
    public void TestOnCorrectReturn5(){
        assertEquals(630000, Solution.getVolume(15, 6 ,7), 0);
    }
}