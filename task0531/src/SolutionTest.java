import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getMin() {
        int[] arr = {180, 5, 5312, 1234, 4, 47747};
        assertEquals(4, Solution.getMin(arr));
    }
}