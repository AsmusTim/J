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
    public void setOut(){ System.setOut(new PrintStream(out)); }

    public void main(String s1, String s2, String s3, String s4, String s5){
        ByteArrayInputStream in1 = new ByteArrayInputStream(s1.getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream(s2.getBytes());
        ByteArrayInputStream in3 = new ByteArrayInputStream(s3.getBytes());
        ByteArrayInputStream in4 = new ByteArrayInputStream(s4.getBytes());
        ByteArrayInputStream in5 = new ByteArrayInputStream(s5.getBytes());
        ByteArrayInputStream[] ins = {in1, in2, in3, in4, in5};

        int sum = 0, in = 0, i = 0;

        while(in != -1){
            System.setIn(ins[i]);
            Scanner sc = new Scanner(System.in);
            in = sc.nextInt();
            sum += in;
            ++i;
        }
        System.out.print(sum);
    }
    public void main(String s1, String s2, String s3){
        ByteArrayInputStream in1 = new ByteArrayInputStream(s1.getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream(s2.getBytes());
        ByteArrayInputStream in3 = new ByteArrayInputStream(s3.getBytes());
        ByteArrayInputStream[] ins = {in1, in2, in3};

        int sum = 0, in = 0, i = 0;

        while(in != -1){
            System.setIn(ins[i]);
            Scanner sc = new Scanner(System.in);
            in = sc.nextInt();
            sum += in;
            ++i;
        }
        System.out.print(sum);
    }

    @Test
    public void test1() {
        main("1", "2", "-1");
        assertEquals("2", out.toString());
    }
    @Test
    public void test2() {
        main("2", "5", "-1");
        assertEquals("6", out.toString());
    }
    @Test
    public void test3() {
        main("1", "2", "5", "9", "-1");
        assertEquals("16", out.toString());
    }
    @Test
    public void test4() {
        main("1", "2", "99", "1", "-1");
        assertEquals("102", out.toString());
    }
}