//import Solution;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

public class SolutionTest {

    public ByteArrayOutputStream out = new ByteArrayOutputStream();
    public Solution.Apple a1;
    public Solution.Apple a2;
    public Solution.Apple a3;

    @Before
    public void createData(){
        Solution.Apple a1 = new Solution.Apple();
        Solution.Apple a2 = new Solution.Apple();
        Solution.Apple a3 = new Solution.Apple();

        Solution.Apple.addPrice(1);
        Solution.Apple.addPrice(-12222);
        Solution.Apple.addPrice(23);
    }

    @Test
    public void test1() {
        assertEquals(24, Solution.Apple.applesPrice);
    }


}