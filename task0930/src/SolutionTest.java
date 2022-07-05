import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void createData(){
        System.setOut(new PrintStream(out));

        Solution.list = new ArrayList<>();
    }


    @Test
    public void test1(){
        Solution.list.add(1);
        Solution.list.add(5);
        Solution.list.add(3);
        Solution.list.add(-23);
        Solution.list.add(4);
        Solution.printTask(Solution.list);
        assertEquals("5\n4\n3\n1\n-23\n", out.toString());
    }

    @Test
    public void test2(){
        Solution.list.add("s");
        Solution.list.add("r");
        Solution.list.add("d");
        Solution.list.add("s");
        Solution.list.add("a");
        Solution.printTask(Solution.list);
        assertEquals("a\n" +
                "d\n" +
                "r\n" +
                "s\n" +
                "s\n", out.toString());
    }
    @Test
    public void test3(){
        Solution.list.add("z");
        Solution.list.add(1);
        Solution.list.add("x");
        Solution.list.add(1);
        Solution.list.add(5);
        Solution.list.add(6);
        Solution.printTask(Solution.list);
        assertEquals("x\n6\nz\n5\n1\n1\n", out.toString());

    }

}