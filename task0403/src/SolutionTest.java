import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    Solution.Cat c;

    @Before
    public void createCat(){
        c = new Solution.Cat();
    }
    @Before
    public void setOut(){
        System.setOut(new PrintStream(out));
    }

    public void data(String s){
        c.setName(s);
        c.printName();
    }

    @Test
    public void testOnCorrectName() {
        data("Murzik");
        assertEquals("Murzik", out.toString());
    }
    @Test
    public void testOnNullName(){
        c.printName();
        assertEquals("Имени нет", out.toString());
    }
}