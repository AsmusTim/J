import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class KissMyShinyMetalAssTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    KissMyShinyMetalAss k;

    @Before
    public void setOut(){
        System.setOut(new PrintStream(out));
        k = new KissMyShinyMetalAss();
    }

    @Test
    public void getName() {
        k.getName();
        assertEquals("name", out.toString());
    }
}