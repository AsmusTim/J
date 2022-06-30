import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {

    ArrayList<String> list;
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void createData(){
        System.setOut(new PrintStream(out));
        list = new ArrayList<>();
        list.add("qwe0");
        list.add("qwe1");
        list.add("qwe");
        list.add("qwe");
        list.add("qwe");
    }

    @Test
    public void permStr() {
        Solution.permStr(list, 2);
        for(String i: list){ System.out.println(i); }
        assertEquals("qwe\nqwe\nqwe\nqwe0\nqwe1\n", out.toString());
    }
}