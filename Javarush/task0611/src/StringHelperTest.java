import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    @Test
    public void multiply() {
        assertEquals("sssss", StringHelper.multiply("s"));
    }

    @Test
    public void testMultiply() {
        assertEquals("aa", StringHelper.multiply("a", 2));
        assertEquals("abc\nabc\nabc\n", StringHelper.multiply("abc\n", 3));
    }
}