import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }

    @Test
    public void test1(){
        assertEquals("even: " + 2 + " " + "odd: " + 2, Solution.getCountEvenOdd(1122));
    }
    @Test
    public void test2(){
        assertEquals("even: " + 0 + " " + "odd: " + 2, Solution.getCountEvenOdd(11));
    }
    @Test
    public void test3(){
        assertEquals("even: " + 2 + " " + "odd: " + 0, Solution.getCountEvenOdd(22));
    }

}