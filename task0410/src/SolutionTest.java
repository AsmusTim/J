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
    public void checkIntervalLeft() {
        Solution.checkInterval(6);
        assertEquals("Число а не содержится в интервале.", out.toString());
    }
    @Test
    public void checkIntervalIn() {
        Solution.checkInterval(75);
        assertEquals("Число а содержится в интервале.", out.toString());
    }
    @Test
    public void checkIntervalRight() {
        Solution.checkInterval(999);
        assertEquals("Число а не содержится в интервале.", out.toString());
    }
}