import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1() throws ParseException {
        assertEquals("Aug 18, 2013", Solution.changeDate("08/18/2013"));
    }
    @Test
    public void test2() throws ParseException {
        assertEquals("May 21, 1993", Solution.changeDate("05/21/1993"));
    }

}