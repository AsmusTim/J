import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution.Cat c;
    ByteArrayOutputStream out = new ByteArrayOutputStream();


    @Before
    public void createData(){
        System.setOut(new PrintStream(out));
        c = new Solution.Cat("Name", 1, 5, 2);
    }

    @Test
    public void test(){
        Solution.printList();
        assertEquals("Cat name is Name, age is 1, weight is 5, tail = 2\n", out.toString());
    }

}