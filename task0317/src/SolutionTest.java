import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private void setOutputStream(){ System.setOut(new PrintStream(outputStream)); }

    @Test
    void main() {
        setOutputStream();
        String[] a = new String[2];
        Solution.main(a);
        assertEquals("日本語\n", outputStream.toString());
    }
}