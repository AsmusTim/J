import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    public ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){
        System.setOut(new PrintStream(out));
    }

    @Test
    public void lessFive() {
        Solution.compare(3);
        assertEquals("Число меньше 5", out.toString());
    }
    @Test
    public void equalFive(){
        Solution.compare(5);
        assertEquals("Число равно 5", out.toString());
    }
    @Test
    public void moreFive(){
        Solution.compare(7);
        assertEquals("Число больше 5", out.toString());
    }
}