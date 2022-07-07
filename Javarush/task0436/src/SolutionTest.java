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
    public void eightRect2x4() {
        Solution.eightRect(2, 4);
        assertEquals("8888\n" +
                "8888\n", out.toString());
    }
    @Test
    public void eightRect3x5() {
        Solution.eightRect(3, 5);
        assertEquals("88888\n" +
                "88888\n" +
                "88888\n", out.toString());
    }
    @Test
    public void eightRect1x1() {
        Solution.eightRect(1, 1
        );
        assertEquals("8\n", out.toString());
    }
}