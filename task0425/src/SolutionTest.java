import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void quarter1() {
        assertEquals(1, Solution.quarter(1, 1));
    }
    @Test
    public void quarter2() {
        assertEquals(2, Solution.quarter(-1, 1));
    }
    @Test
    public void quarter3() {
        assertEquals(3, Solution.quarter(-1, -1));
    }
    @Test
    public void quarter4() {
        assertEquals(4, Solution.quarter(1, -1));
    }
}