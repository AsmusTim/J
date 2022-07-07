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
    public void printEven() {
        Solution.printEven();
        assertEquals("2\n" +
                "4\n" +
                "6\n" +
                "8\n" +
                "10\n" +
                "12\n" +
                "14\n" +
                "16\n" +
                "18\n" +
                "20\n" +
                "22\n" +
                "24\n" +
                "26\n" +
                "28\n" +
                "30\n" +
                "32\n" +
                "34\n" +
                "36\n" +
                "38\n" +
                "40\n" +
                "42\n" +
                "44\n" +
                "46\n" +
                "48\n" +
                "50\n" +
                "52\n" +
                "54\n" +
                "56\n" +
                "58\n" +
                "60\n" +
                "62\n" +
                "64\n" +
                "66\n" +
                "68\n" +
                "70\n" +
                "72\n" +
                "74\n" +
                "76\n" +
                "78\n" +
                "80\n" +
                "82\n" +
                "84\n" +
                "86\n" +
                "88\n" +
                "90\n" +
                "92\n" +
                "94\n" +
                "96\n" +
                "98\n" +
                "100\n", out.toString());
    }
}