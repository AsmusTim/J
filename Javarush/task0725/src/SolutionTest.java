import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getValue() {
        Solution s = new Solution();
        assertEquals(10, s.getValue());
    }
}