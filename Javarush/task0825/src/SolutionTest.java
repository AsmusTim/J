import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test(){
        Solution s = new Solution();
        assertEquals(100, s.getValue() * s.getValue2());
    }

}