import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {
    public ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setStream(){
        System.setOut(new PrintStream(outStream));
    }

    @Test
    public void main() {
        String[] s = new String[1];
        Solution.main(s);
        assertEquals("850", outStream.toString());
    }
}