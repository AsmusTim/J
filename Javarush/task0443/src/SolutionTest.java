import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.ParseException;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){System.setOut(new PrintStream(out));}

    @Test
    public void printDataBornTest1() throws ParseException {
        Solution.printDataBorn("Name1", "2.2.2002");
        assertEquals("Меня зовут Name1\n" +
                "Я родился 2.2.2002", out.toString());
    }
    @Test
    public void printDataBornTest2() throws ParseException {
        Solution.printDataBorn("Name2", "5.12.1999");
        assertEquals("Меня зовут Name2\n" +
                "Я родился 5.12.1999", out.toString());
    }
    @Test
    public void printDataBornTest3() throws ParseException {
        Solution.printDataBorn("Name1", "31.13.2002");
        assertEquals("Меня зовут Name1\n" +
                "Я родился 31.1.2003", out.toString());
    }
}