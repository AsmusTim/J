import org.junit.Test;
import java.text.ParseException;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() throws ParseException {
        assertTrue(Solution.isDateOdd("JANUARY 1 2000"));
        assertTrue(!Solution.isDateOdd("JANUARY 2 2020"));
    }

    @Test
    public void test1(){
        assertEquals(4, Solution.getNumberOfMonth("April"));
        assertEquals(9, Solution.getNumberOfMonth("SepTeMbEr"));
        assertEquals(1, Solution.getNumberOfMonth("JANUARY"));
    }
}