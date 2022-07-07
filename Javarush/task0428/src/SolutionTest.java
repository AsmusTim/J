import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SolutionTest {

    public ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){System.setOut(new PrintStream(out));}

    public void main(String s1, String s2, String s3){
        ByteArrayInputStream in1 = new ByteArrayInputStream(s1.getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream(s2.getBytes());
        ByteArrayInputStream in3 = new ByteArrayInputStream(s3.getBytes());
        ByteArrayInputStream[] ins = {in1, in2, in3};

        int count = 0;
        for(int i = 0; i < 3; i++){
            System.setIn(ins[i]);
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a > 0) count++;
        }
        System.out.print(count);
    }

    @Test
    public void allPos() {
        main("1", "2", "3");
        assertEquals("3", out.toString());
    }
    @Test
    public void onePos() {
        main("-1", "2", "-3");
        assertEquals("1", out.toString());
    }
    @Test
    public void twoPos() {
        main("1", "-2", "3");
        assertEquals("2", out.toString());
    }
    @Test
    public void allNeg() {
        main("-1", "-2", "-3");
        assertEquals("0", out.toString());
    }
}