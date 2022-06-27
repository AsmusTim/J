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
    public void faceControlPrintMessage() {
        Solution.faceControl(32);
        assertEquals("И 18-ти достаточно", out.toString());
    }
    @Test
    public void faceControlEmptyMessage() {
        Solution.faceControl(12);
        assertEquals("", out.toString());
    }
}