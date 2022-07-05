import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    int[] arr = new int[30];

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }

    @Test
    public void test(){
        for(int i = 30; i > 0; --i){
            arr[30 - i] = i;
        }
        Solution.getMins(arr);
        assertEquals("10 11", out.toString());
    }

}