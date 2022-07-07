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
    public void emptyStr() {
        Solution.repeatStr(0, "a");
        assertEquals("", out.toString());
    }
    @Test
    public void repeatOne() {
        Solution.repeatStr(1, "a");
        assertEquals("a\n", out.toString());
    }
    @Test
    public void emptyTwo() {
        Solution.repeatStr(2, "a");
        assertEquals("a\na\n", out.toString());
    }
}