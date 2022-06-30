import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){
        System.setOut(new PrintStream(out));
        Solution.list = new ArrayList<>();
        Solution.list.add("1");
        Solution.list.add("12");
        Solution.list.add("123");
        Solution.list.add("1234");
        Solution.list.add("1");
    }

    @Test
    public void test1(){
        assertEquals(4, Solution.increaseLen(Solution.list));
    }
    @Test
    public void test2(){
        Solution.list.remove(4);
        assertEquals(-1, Solution.increaseLen(Solution.list));
    }

}