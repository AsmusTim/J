import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){
        System.setOut(new PrintStream(out));
    }

    @Test
    public void test1() {
        Solution.trio(1, 1, 0);
        assertEquals("1 1", out.toString());
    }
    @Test
    public void test2() {
        Solution.trio(0, 2, 2);
        assertEquals("2 2", out.toString());
    }
    @Test
    public void test3() {
        Solution.trio(3, 0, 3);
        assertEquals("3 3", out.toString());
    }
    @Test
    public void test4() {
        Solution.trio(4, 4, 4);
        assertEquals("4 4 4", out.toString());
    }
    @Test
    public void test5() {
        Solution.trio(1, 2, 3);
        assertEquals("", out.toString());
    }
}