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
    public void saysLove() {
        Solution.saysLove("name");
        assertEquals("name любит меня.\n" +
                "name любит меня.\n" +
                "name любит меня.\n" +
                "name любит меня.\n" +
                "name любит меня.\n" +
                "name любит меня.\n" +
                "name любит меня.\n" +
                "name любит меня.\n" +
                "name любит меня.\n" +
                "name любит меня.\n", out.toString());
    }
}