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

    @Test
    public void test(){
        ByteArrayInputStream in1 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream("2".getBytes());
        ByteArrayInputStream in3 = new ByteArrayInputStream("3".getBytes());
        ByteArrayInputStream in4 = new ByteArrayInputStream("4".getBytes());
        ByteArrayInputStream in5 = new ByteArrayInputStream("5".getBytes());
        ByteArrayInputStream in6 = new ByteArrayInputStream("6".getBytes());
        ByteArrayInputStream in7 = new ByteArrayInputStream("7".getBytes());
        ByteArrayInputStream in8 = new ByteArrayInputStream("8".getBytes());
        ByteArrayInputStream[] ins = {in1, in2, in3, in4, in5, in6, in7, in8};


        String[] arr = new String[10];
        Scanner sc;

        for(int i = 0; i < 8; ++i){
            System.setIn(ins[i]);
            sc = new Scanner(System.in);
            arr[i] = sc.nextLine();
        }
        for(int i = arr.length - 1; i > -1; --i){
            if(arr[i] != null){System.out.println(arr[i]);}
        }
        assertEquals("8\n" +
                "7\n" +
                "6\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1\n", out.toString());
    }

}