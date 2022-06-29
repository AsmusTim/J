import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getMax() {
        int[] arr = {234, 7, 312, 78, 43, 890, 790};
        assertEquals(890, Solution.getMax(arr));
    }
}