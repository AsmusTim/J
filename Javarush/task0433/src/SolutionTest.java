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
    public void sQuadrate() {
        Solution.sQuadrate();
        assertEquals("ssssssssss\n" +
                              "ssssssssss\n" +
                              "ssssssssss\n" +
                              "ssssssssss\n" +
                              "ssssssssss\n" +
                              "ssssssssss\n" +
                              "ssssssssss\n" +
                              "ssssssssss\n" +
                              "ssssssssss\n" +
                              "ssssssssss\n", out.toString());
    }
}