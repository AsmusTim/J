import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){System.setOut(new PrintStream(out));}

    @Test
    public void test(){
        SimpleDateFormat formatter = new SimpleDateFormat("d MM yyyy");
        Date date = new Date();
        Solution.getDate();
        assertEquals(formatter.format(date), out.toString());
    }

}