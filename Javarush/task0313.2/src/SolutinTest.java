import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutinTest {

    public ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }


    @Test
    public void main() {
        String[] s = new String[1];
        Solutin.main(s);
        assertEquals("МамаМылаРаму\n" +
                "МамаРамуМыла\n" +
                "РамуМамаМыла\n" +
                "РамуМылаМама\n" +
                "МылаРамуМама\n" +
                "МылаМамаРаму\n", out.toString());
    }
}