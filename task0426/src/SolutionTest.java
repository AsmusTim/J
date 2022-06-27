import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    public ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){System.setOut(new PrintStream(out));}

    @Test
    public void negOdd() {
        Solution.characterNumber(-5);
        assertEquals("отрицательное нечетное число", out.toString());

    }
    @Test
    public void negEven() {
        Solution.characterNumber(-10);
        assertEquals("отрицательное четное число", out.toString());
    }
    @Test
    public void posOdd() {
        Solution.characterNumber(99);
        assertEquals("положительное нечетное число", out.toString());
    }
    @Test
    public void posEven() {
        Solution.characterNumber(222);
        assertEquals("положительное четное число", out.toString());
    }
    @Test
    public void zero() {
        Solution.characterNumber(0);
        assertEquals("ноль", out.toString());
    }
}