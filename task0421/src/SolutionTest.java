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
    public void equalName() {
        Solution.nasOrNast("aaa", "aaa");
        assertEquals("Имена идентичны", out.toString());
    }
    @Test
    public void equalLength() {
        Solution.nasOrNast("aaa", "aab");
        assertEquals("Длины имен равны", out.toString());
    }
    @Test
    public void emptyOut() {
        Solution.nasOrNast("aaa", "aa32");
        assertEquals("", out.toString());
    }
}