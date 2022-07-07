import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    public ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setOutStream(){
        System.setOut(new PrintStream(outStream));
    }

    @Test
    public void printDateBorn() {
        Solution.printDateBorn();
        assertEquals("Jul 17 2001", outStream.toString());
    }
}