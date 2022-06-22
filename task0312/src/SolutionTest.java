import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void test1(){
        assertEquals(0, Solution.convertToSeconds(0));
    }
    @Test
    void test2(){
        assertEquals(22 * 3600, Solution.convertToSeconds(22));
    }
    @Test
    void test3(){
        assertEquals(59876 * 3600, Solution.convertToSeconds(59876));
    }
    @Test
    void test4(){
        assertEquals(1029384756 * 3600, Solution.convertToSeconds(1029384756));
    }
    @Test
    void test5(){
        assertEquals(0, Solution.convertToSeconds(-12));
    }
}