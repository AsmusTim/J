import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }

    @Test
    public void printFirstMaxNum() {
        int[] arr = {32, 12, 6543, 312, 6, 4, 543, 5, 3, 7, 23, 7, 32, 1, 5, 7, 0, 7, 5, 3, 6};
        Solution.printFirstMaxNum(arr);
        assertEquals("6543\n543\n312\n32\n32\n", out.toString());
    }
}