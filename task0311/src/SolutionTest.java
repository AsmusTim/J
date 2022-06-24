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
    public void writeToConsole0() {
        Solution.writeToConsole("String");
        assertEquals("Printing: String", out.toString());
    }

    @Test
    public void writeToConsole1() {
        Solution.writeToConsole("Char");
        assertEquals("Printing: Char", out.toString());
    }
}