import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Set;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    Set<String> keys;

    @Before
    public void setOut(){
        System.setOut(new PrintStream(out));
        Solution.map = new HashMap<>();
        Solution.init(Solution.map);
        keys = Solution.map.keySet();
    }

    @Test
    public void task0802Task0806(){
        for(String s: keys){
            System.out.println(s + " - " + Solution.map.get(s));
        }
        assertEquals("дыня - овощ\n" +
                "ежевика - куст\n" +
                "банан - трава\n" +
                "арбуз - ягода\n" +
                "груша - фрукт\n" +
                "картофель - клубень\n" +
                "земляника - ягода\n" +
                "ирис - цветок\n" +
                "вишня - ягода\n" +
                "жень-шень - корень\n", out.toString());
    }

    @Test
    public void task0804(){
        for(String s: keys){ System.out.println(s); }
        assertTrue(keys.contains("дыня"));
        assertTrue(keys.contains("ежевика"));
        assertTrue(keys.contains("банан"));
        assertTrue(keys.contains("арбуз"));
        assertTrue(keys.contains("груша"));
        assertTrue(keys.contains("картофель"));
        assertTrue(keys.contains("земляника"));
        assertTrue(keys.contains("ирис"));
        assertTrue(keys.contains("вишня"));
        assertTrue(keys.contains("жень-шень"));
    }
    @Test
    public void task0805(){
        for(String s: keys){
            System.out.println(Solution.map.get(s));
        }
        assertEquals("овощ\n" +
                "куст\n" +
                "трава\n" +
                "ягода\n" +
                "фрукт\n" +
                "клубень\n" +
                "ягода\n" +
                "цветок\n" +
                "ягода\n" +
                "корень\n", out.toString());
    }
}