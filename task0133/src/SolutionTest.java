import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SolutionTest {

    @Test
    public void shouldReturnCorrectValue() {
        assertEquals(389, Solution.getCountSecondsPassedInCurrentHour(356789), 0);
    }
    @Test
    public void shouldReturnZeroValue(){
        assertEquals(0, Solution.getCountSecondsPassedInCurrentHour(3600), 0);
    }
    @Test
    public void shouldReturnCorrectValue1(){
        assertEquals(3090, Solution.getCountSecondsPassedInCurrentHour(67890), 0);
    }

    @Test
    public void shouldReturnCorrectValue2(){
        assertEquals(123, Solution.getCountSecondsPassedInCurrentHour(123), 0);
    }

    @Test
    public void shouldReturnCorrectValue3(){
        assertEquals(1, Solution.getCountSecondsPassedInCurrentHour(3601), 0);
    }
}