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
    public void setOut(){ System.setOut(new PrintStream(out)); }

    @Test
    public void test(){
        ArrayList<String> arrStr = new ArrayList<>();
        ArrayList<Integer> arrInt = new ArrayList<>();

        arrStr.add("abc");
        arrInt.add(1);
        arrStr.add("sdf");
        arrInt.add(1);

        Solution.printMap(arrInt, arrStr);

        assertEquals("1 abc\n" +
                "1 sdf\n", out.toString());
    }

}