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
    public void main() {
        String[] arr = new String[2];
        Solution.main(arr);
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n", out.toString());

    }
}