import org.junit.Before;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    public final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    public final PrintStream originOut = System.out;

    public void setUpStreams() {System.setOut(new PrintStream(outContent));}

    @Test
    void TestPrint(){
        setUpStreams();
        String[] a = new String[1];
        Solution.main(a);
        assertEquals("Red\nOrange\nYellow\nGreen\nBlue\nIndigo\nViolet\n", outContent.toString());
    }
}