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
    public void printMessage(){
        Solution.adult(12);
        assertEquals("Подрасти еще", out.toString());
    }
    @Test
    public void noPrintMessage(){
        Solution.adult(121);
        assertEquals("", out.toString());
    }
}