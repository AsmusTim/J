import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    Solution.Cat c;

    @Before
    public void createCate(){
        c = new Solution.Cat();
        c.setCatsCount(10);
        c.setName("Barsik", "GaditInTapki");
    }
    @Before
    public void setOut(){
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testOnCatsCount() {
        assertEquals(10, c.getCatsCount());
    }
    @Test
    public void testOnCount(){
        assertEquals(1, Solution.Cat.count);
    }
    @Test
    public void testOnName(){
        assertTrue("Barsik GaditInTapki".equals(c.getName()));
    }
}