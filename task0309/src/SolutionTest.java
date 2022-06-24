import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setOutStream(){
        System.setOut(new PrintStream(outStream));
    }

    @Test
    public void main() {
        String[] s = new String[1];
        Solution.main(s);
        assertEquals("1\n3\n6\n10\n15\n21\n28\n36\n45\n55\n", outStream.toString());
    }
}