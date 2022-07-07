import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ConsoleReaderTest {


  
    @Test
    public void readString() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("abc".getBytes());
        System.setIn(in);
        String string = ConsoleReader.readString();
        assertEquals("abc", string);
    }

    @Test
    public void readInt() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("123".getBytes());
        System.setIn(in);
        int integer = ConsoleReader.readInt();
        assertEquals(123, integer);
    }

    @Test
    public void readDouble() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("3.14".getBytes());
        System.setIn(in);
        double d = ConsoleReader.readDouble();
        assertEquals(3.14, d, 0.01);
    }

    @Test
    public void readBoolean() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("true".getBytes());
        System.setIn(in);
        boolean bool = ConsoleReader.readBoolean();
        assertTrue(bool);
    }
}
