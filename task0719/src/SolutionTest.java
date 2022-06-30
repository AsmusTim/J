import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){
        System.setOut(new PrintStream(out));
        Solution.list = new ArrayList<>();
        String[] str = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for(int i = 0; i < 10; ++i){
            System.setIn(new ByteArrayInputStream(str[i].getBytes()));
            Solution.list.add(0, new Scanner(System.in).nextInt());
        }
    }

    @Test
    public void test(){
        for(int i: Solution.list){
            System.out.println(i);
        }
        assertEquals("10\n9\n8\n7\n6\n5\n4\n3\n2\n1\n", out.toString());
    }

}