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
    public void setOut(){System.setOut(new PrintStream(out));}

    public void main(String s1, String s2, String s3){
        ByteArrayInputStream in1 = new ByteArrayInputStream(s1.getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream(s2.getBytes());
        ByteArrayInputStream in3 = new ByteArrayInputStream(s3.getBytes());
        ByteArrayInputStream[] ins = {in1, in2, in3};

        int countNeg = 0, countPos = 0;
        for(int i = 0; i < 3; ++i){
            System.setIn(ins[i]);
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a < 0) countNeg++;
            if(a > 0) countPos++;
        }
        System.out.print("количество отрицательных чисел: " + countNeg +"\n" + "количество положительных чисел: " + countPos);
    }

    @Test
    public void test1() {
        main("1", "2", "3");
        assertEquals("количество отрицательных чисел: " + 0 +"\n" + "количество положительных чисел: " + 3, out.toString());
    }
    @Test
    public void test2() {
        main("-1", "2", "3");
        assertEquals("количество отрицательных чисел: " + 1 +"\n" + "количество положительных чисел: " + 2, out.toString());
    }
    @Test
    public void test3() {
        main("1", "-2", "-3");
        assertEquals("количество отрицательных чисел: " + 2 +"\n" + "количество положительных чисел: " + 1, out.toString());
    }
    @Test
    public void test4() {
        main("-1", "-2", "-3");
        assertEquals("количество отрицательных чисел: " + 3 +"\n" + "количество положительных чисел: " + 0, out.toString());
    }
    @Test
    public void test5() {
        main("0", "0", "0");
        assertEquals("количество отрицательных чисел: " + 0 +"\n" + "количество положительных чисел: " + 0, out.toString());
    }
}