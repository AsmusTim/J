import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){
        System.setOut(new PrintStream(out));
    }

    public void main(String s){
        ByteArrayInputStream in = new ByteArrayInputStream(s.getBytes());
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = a < 0 ? a + 1 : (a > 0 ? a *= 2 : 0);
        System.out.print(a);
    }

    @Test
    public void test1() {
        main("-1000");
        assertEquals("-999", out.toString());
    }
    @Test
    public void test2() {
        main("0");
        assertEquals("0", out.toString());
    }
    @Test
    public void test3() {
        main("100");
        assertEquals("200", out.toString());
    }
}