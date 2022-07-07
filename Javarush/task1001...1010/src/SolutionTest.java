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
    public void testTask1001(){
        Solution.method();
        assertEquals("9223372036854775807\n", out.toString());
    }

    @Test
    public void testTask1002(){
        Solution.method1();
        assertEquals("3.765\n", out.toString());
    }

    @Test
    public void testTask1003(){
        Solution.method2();
        assertEquals("0\n", out.toString());
    }

    @Test
    public void testTask1004(){
        Solution.method3();
        assertEquals("9\n", out.toString());
    }

    @Test
    public void testTask1005(){
        Solution.method4();
        assertEquals("256\n", out.toString());
    }

    @Test
    public void testTask1006(){
        Solution.method5();
        assertEquals("result: 1000.0\n", out.toString());
    }

    @Test
    public void testTask1007(){
        Solution.method6();
        assertEquals("1234567\n", out.toString());
    }

    @Test
    public void testTask1008(){
        assertEquals(2.941, Solution.method7(), 0.001);
    }

    @Test
    public void testTask1009(){
        assertEquals(5.5, Solution.method8(), 0.1);
    }

    @Test
    public void testTask1010(){
        assertEquals(1.0, Solution.method9(), 0.1);
    }



}