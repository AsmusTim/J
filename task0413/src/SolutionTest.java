import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SolutionTest {

    public ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }

    public void main(String s){
        ByteArrayInputStream in = new ByteArrayInputStream(s.getBytes());
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1 -> System.out.print("Понедельник");
            case 2 -> System.out.print("Вторник");
            case 3 -> System.out.print("Среда");
            case 4 -> System.out.print("Четверг");
            case 5 -> System.out.print("Пятница");
            case 6 -> System.out.print("Суббота");
            case 7 -> System.out.print("Воскресенье");
            default -> System.out.print("Такого дня недели не существует");
        }
    }

    @Test
    public void test1() {
        main("1");
        assertEquals("Понедельник", out.toString());
    }
    @Test
    public void test2() {
        main("2");
        assertEquals("Вторник", out.toString());
    }
    @Test
    public void test3() {
        main("3");
        assertEquals("Среда", out.toString());
    }
    @Test
    public void test4() {
        main("4");
        assertEquals("Четверг", out.toString());
    }
    @Test
    public void test5() {
        main("5");
        assertEquals("Пятница", out.toString());
    }
    @Test
    public void test6() {
        main("6");
        assertEquals("Суббота", out.toString());
    }
    @Test
    public void test7() {
        main("7");
        assertEquals("Воскресенье", out.toString());
    }
    @Test
    public void test8() {
        main("8");
        assertEquals("Такого дня недели не существует", out.toString());
    }
}