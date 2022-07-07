import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    public ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){
        System.setOut(new PrintStream(out));
    }

    @Test
    public void test1() {
        Solution.checkSeason(1);
        assertEquals("Зима", out.toString());
    }
    @Test
    public void test2() {
        Solution.checkSeason(2);
        assertEquals("Зима", out.toString());
    }
    @Test
    public void test3() {
        Solution.checkSeason(3);
        assertEquals("Весна", out.toString());
    }
    @Test
    public void test4() {
        Solution.checkSeason(4);
        assertEquals("Весна", out.toString());
    }
    @Test
    public void test5() {
        Solution.checkSeason(5);
        assertEquals("Весна", out.toString());
    }
    @Test
    public void test6() {
        Solution.checkSeason(6);
        assertEquals("Лето", out.toString());
    }
    @Test
    public void test7() {
        Solution.checkSeason(7);
        assertEquals("Лето", out.toString());
    }
    @Test
    public void test8() {
        Solution.checkSeason(8);
        assertEquals("Лето", out.toString());
    }
    @Test
    public void test9() {
        Solution.checkSeason(9);
        assertEquals("Осень", out.toString());
    }
    @Test
    public void test10() {
        Solution.checkSeason(10);
        assertEquals("Осень", out.toString());
    }
    @Test
    public void test11() {
        Solution.checkSeason(11);
        assertEquals("Осень", out.toString());
    }
    @Test
    public void test12() {
        Solution.checkSeason(12);
        assertEquals("Зима", out.toString());
    }
    @Test
    public void test99() {
        Solution.checkSeason(99);
        assertEquals("", out.toString());
    }
    @Test
    public void test100500() {
        Solution.checkSeason(-100500);
        assertEquals("", out.toString());
    }
}