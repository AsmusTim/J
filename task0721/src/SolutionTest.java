import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findeMinMax() {
        int[] arr = {21, 412, 123, -421, 123, -532, 123, -63, -5337, 264332};
        int[] res = Solution.findeMinMax(arr);
        assertEquals(-5337, res[0]);
        assertEquals(264332, res[1]);

    }
}