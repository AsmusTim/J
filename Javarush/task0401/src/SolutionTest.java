import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    public ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }

    @Test
    public void main() {
        String[] s = new String[1];
        Solution.main(s);
        assertEquals("Age is: 20\n" +
                "The Age in adjustAge() is 20\n" +
                "Adjusted Age is: 40\n", out.toString());
    }
}