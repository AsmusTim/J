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
    public void printEightTriangle() {
        Solution.printEightTriangle();
        assertEquals("8\n" +
                "88\n" +
                "888\n" +
                "8888\n" +
                "88888\n" +
                "888888\n" +
                "8888888\n" +
                "88888888\n" +
                "888888888\n" +
                "8888888888\n", out.toString());
    }
}