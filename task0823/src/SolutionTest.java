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
        String s = Solution.getUpperString("мама мыла раму");
        System.out.print(s);
        assertEquals("Мама Мыла Раму", out.toString());
    }
    @Test
    public void test2(){
        String s = Solution.getUpperString(" abcd kd ddfg");
        System.out.print(s);
        assertEquals(" Abcd Kd Ddfg", out.toString());
    }

}