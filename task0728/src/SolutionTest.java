import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void createData(){
        System.setOut(new PrintStream(out));

        Solution.arr = new int[20];

        for(int i = 0; i < 20; ++i){
            Solution.arr[i] = i;
        }
    }

    @Test
    public void test(){
        Solution.getDecreasingLine(Solution.arr);
        for(int i: Solution.arr){ System.out.print(i); }
        assertEquals("191817161514131211109876543210", out.toString());
    }

}