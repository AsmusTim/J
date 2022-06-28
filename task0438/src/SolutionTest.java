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
    public void someFromEight() {
        Solution.someFromEight();
        assertEquals("8         \n" +
                "8         \n" +
                "8         \n" +
                "8         \n" +
                "8         \n" +
                "8         \n" +
                "8         \n" +
                "8         \n" +
                "8         \n" +
                "8888888888\n", out.toString());
    }
}