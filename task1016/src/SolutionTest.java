import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    String[] arrWords;

    @Before
    public void createData(){
        System.setOut(new PrintStream(out));
        arrWords = new String[]{"1", "2", "3", "4", "5", "abc", "3", "4", "5", "aBc", "c", "d", "q", "r", "abc", "4", "5", "1", "1", "2"};
    }

    @Test
    public void test(){
        Solution.countRepeatWords(arrWords);
        assertEquals("1: 3\n" +
                "q: 1\n" +
                "2: 2\n" +
                "r: 1\n" +
                "3: 2\n" +
                "abc: 2\n" +
                "aBc: 1\n" +
                "c: 1\n" +
                "4: 3\n" +
                "d: 1\n" +
                "5: 3\n", out.toString());
    }

}