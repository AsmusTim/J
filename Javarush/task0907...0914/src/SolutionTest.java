import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }

    //task0907=================================================
    @Test
    public void interceptionException() {
        Solution.interceptionException();
        assertEquals("/ by zero\n", out.toString());
    }

    //task0908================================================
    @Test
    public void interceptionException1(){
        Solution.interceptionException1();
        assertEquals("", out.toString());
    }

    //task0909=============================================
    @Test
    public void interceptionException2(){
        Solution.interceptionException2();
        assertEquals("Index 8 out of bounds for length 2", out.toString());
    }

    //task0910================================================
    @Test
    public void interceptionException3(){
        Solution.interceptionException3();
        assertEquals("Index 18 out of bounds for length 0", out.toString());
    }

    //task0911====================================================
    @Test
    public void interceptionException4(){
        Solution.interceptionException4();
        assertEquals("Cannot invoke \"java.util.Map.size()\" because \"m\" is null", out.toString());
    }

    //task0912=======================================================
    @Test
    public void interceptionException5(){
        Solution.interceptionException5();
        assertEquals("For input string: \"XYZ\"", out.toString());
    }

    //task0913===========================================================
    @Test
    public void interceptionException6(){
        Solution.interceptionException6(1);
        assertEquals("NullPointerException", out.toString());
    }
    @Test
    public void interceptionException6_1(){
        Solution.interceptionException6(4);
        assertEquals("FileNotFoundException", out.toString());
    }

    //task0914======================================================
    @Test
    public void customerException(){
        Solution.customerException(0);
        assertEquals("Exception1", out.toString());
    }
}