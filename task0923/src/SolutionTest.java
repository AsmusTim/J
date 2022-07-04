import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }

    @Test
    public void test1(){
        Solution.getSplitString("Мама Мыла Раму.");
        assertEquals("а а ы а а у \n" +
                "М м М л Р м . ", out.toString());
    }
    @Test
    public void test2(){
        Solution.getSplitString("мама мыла раму.");
        assertEquals("а а ы а а у \n" +
                "м м м л р м . ", out.toString());
    }
    @Test
    public void test3(){
        Solution.getSplitString("МАМА МЫЛА РАМУ.");
        assertEquals("А А Ы А А У \n" +
                "М М М Л Р М . ", out.toString());
    }

}