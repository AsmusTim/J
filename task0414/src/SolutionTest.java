import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    public ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setDate(){
        System.setOut(new PrintStream(out));
    }

    @Test
    public void leapYear() {
        Solution.getDaysInYear(2000);
        assertEquals("количество дней в году: " + 366, out.toString());
    }
    @Test
    public void noLeapYear() {
        Solution.getDaysInYear(2022);
        assertEquals("количество дней в году: " + 365, out.toString());
    }
}