import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    public ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){System.setOut(new PrintStream(out));}

    @Test
    public void evenOneDigit() {
        Solution.characterNumber(6);
        assertEquals("четное однозначное число", out.toString());
    }
    @Test
    public void oddOneDigit() {
        Solution.characterNumber(3);
        assertEquals("нечетное однозначное число", out.toString());
    }
    @Test
    public void evenTwoDigit() {
        Solution.characterNumber(66);
        assertEquals("четное двузначное число", out.toString());
    }
    @Test
    public void oddTwoDigit() {
        Solution.characterNumber(37);
        assertEquals("нечетное двузначное число", out.toString());
    }
    @Test
    public void evenTreeDigit() {
        Solution.characterNumber(600);
        assertEquals("четное трехзначное число", out.toString());
    }
    @Test
    public void oddTreeDigit() {
        Solution.characterNumber(231);
        assertEquals("нечетное трехзначное число", out.toString());
    }
    @Test
    public void leftFromRange() {
        Solution.characterNumber(-500);
        assertEquals("", out.toString());
    }
    @Test
    public void rightFromRange() {
        Solution.characterNumber(1001);
        assertEquals("", out.toString());
    }
}