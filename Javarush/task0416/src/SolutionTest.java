import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOutSteam(){
        System.setOut(new PrintStream(out));
    }

    @Test
    public void green() {
        Solution.threeColor(32.67);
        assertEquals("зелёный", out.toString());
    }
    @Test
    public void yellow() {
        Solution.threeColor(63.97);
        assertEquals("желтый", out.toString());
    }
    @Test
    public void red() {
        Solution.threeColor(94.43);
        assertEquals("красный", out.toString());
    }

    @Test
    public void negGreen() {
        Solution.threeColor(-991.32);
        assertEquals("зелёный", out.toString());
    }
    @Test
    public void negYellow() {
        Solution.threeColor(-43.32);
        assertEquals("желтый", out.toString());
    }
    @Test
    public void negRed() {
        Solution.threeColor(-54.71);
        assertEquals("красный", out.toString());
    }
}