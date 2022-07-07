import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originOut = System.out;

    void setUpStreams(){System.setOut(new PrintStream(out));}

    @Test
    void main() {
        setUpStreams();
        String[] a = new String[1];
        Solution.main(a);
        assertEquals("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"\nIt's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"", out.toString());
    }
}