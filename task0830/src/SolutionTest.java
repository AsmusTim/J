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
        String[] str = {"2", "d", "f", "a", "c", "b"};
        for(String s: str){
            Solution.list.add(s);
        }
    }

    @Test
    public void test(){
        Solution.sortList(Solution.list);
        assertEquals("2\na\nb\nc\nd\nf\n", out.toString());
    }

}