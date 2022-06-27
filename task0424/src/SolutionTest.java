import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void firstDif() {
        assertEquals(1, Solution.different(1, 2, 2));
    }
    @Test
    public void secondDif() {
        assertEquals(2, Solution.different(3, 2, 3));
    }
    @Test
    public void thirdDif() {
        assertEquals(3, Solution.different(1, 1, 2));
    }
    @Test
    public void allEqual(){
        assertEquals(-1, Solution.different(7, 7, 7));
    }
}