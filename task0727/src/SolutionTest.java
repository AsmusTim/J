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
        String[] str = {"1", "22", "a", "asdf"};
        for(int i = 0; i < str.length; ++i){
            Solution.list.add(str[i]);
        }
    }

    @Test
    public void getChangeList() {
        ArrayList<String> lst = Solution.getChangeList(Solution.list);
        for(String i: lst){
            System.out.println(i);
        }
        assertEquals("1\n1\n1\n22\n22\na\na\na\nasdf\nasdf\n", out.toString());
    }
}