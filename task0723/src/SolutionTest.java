import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }

    @Test
    public void getBoom() throws InterruptedException {
        Solution.getBoom();
        assertEquals("29\n" +
                "28\n" +
                "27\n" +
                "26\n" +
                "25\n" +
                "24\n" +
                "23\n" +
                "22\n" +
                "21\n" +
                "20\n" +
                "19\n" +
                "18\n" +
                "17\n" +
                "16\n" +
                "15\n" +
                "14\n" +
                "13\n" +
                "12\n" +
                "11\n" +
                "10\n" +
                "9\n" +
                "8\n" +
                "7\n" +
                "6\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "0\n" +
                "Boom!\n", out.toString());

    }
}