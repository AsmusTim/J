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
        try {
            throw new Solution.MyException();
        }
        catch (Solution.MyException e){
            System.out.print("Exception");
            assertEquals("Exception", out.toString());
        }
    }
    @Test
    public void test2(){
        try {
            throw new Solution.MyException2();
        }
        catch (Solution.MyException2 e){
            System.out.print("Exception");
            assertEquals("Exception", out.toString());
        }
    }
    @Test
    public void test3(){
        try {
            throw new Solution.MyException3();
        }
        catch (Solution.MyException3 e){
            System.out.print("RuntimeException");
            assertEquals("RuntimeException", out.toString());
        }
    }
    @Test
    public void test4(){
        try {
            throw new Solution.MyException4();
        }
        catch (Solution.MyException4 e){
            System.out.print("RuntimeException");
            assertEquals("RuntimeException", out.toString());
        }
    }

}