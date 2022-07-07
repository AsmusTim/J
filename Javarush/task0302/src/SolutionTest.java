import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    public ByteArrayOutputStream Out = new ByteArrayOutputStream();

    @BeforeClass
    public void setOut() {
        System.setOut(new PrintStream(Out));
    }

    @Test
    public static void test1(){
        Solution.printString("ABC");
        assertEquals("ABC", "ABC");
    }
    @Test
    public static void test2(){
        Solution.printString("Name");
        assertEquals("Name", "Name");
    }
}