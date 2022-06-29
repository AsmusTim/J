import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BodyTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }

    @Test
    public void getIMB1() {
        Body.getIMB(45, 2.15);
        assertEquals("Недовес: меньше чем 18.5", out.toString());
    }
    @Test
    public void getIMB2() {
        Body.getIMB(120, 1.5);
        assertEquals("Ожирение: 30 или больше", out.toString());
    }
    @Test
    public void getIMB3() {
        Body.getIMB(85, 1.75);
        assertEquals("Избыточный вес: между 25 и 29.9", out.toString());
    }
    @Test
    public void getIMB4() {
        Body.getIMB(50, 1.5);
        assertEquals("Нормальный: между 18.5 и 24.9", out.toString());
    }
}