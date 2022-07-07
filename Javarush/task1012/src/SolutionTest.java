import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    String[] inputStr = {"ааа", "ббб", "ввв", "ссс", "еее", "ппп", "ффф", "ъъъ", "ккк", "ррр"};


    @Before
    public void setOut(){
        System.setOut(new PrintStream(out));
    }

    @Test
    public void test(){
        Map<Character, Integer> map = new HashMap<>();
        Solution.init(map);
        String str;
        Scanner sc;
        for(int i = 0; i < 10; ++i){
            System.setIn(new ByteArrayInputStream(inputStr[i].getBytes()));
            sc = new Scanner(System.in);
            str = sc.nextLine();
            char[] str1 = str.toCharArray();

            for(int j = 0; j < str1.length; ++j){
                int count = map.get(str1[j]);
                count++;
                map.put(str1[j], count);
            }
        }
        for(int i = 0; i < Solution.abc.length; ++i){
            System.out.println(Solution.abc[i] + ": " + map.get(Solution.abc[i]));
        }

        assertEquals("а: 3\n" +
                "б: 3\n" +
                "в: 3\n" +
                "г: 0\n" +
                "д: 0\n" +
                "е: 3\n" +
                "ё: 0\n" +
                "ж: 0\n" +
                "з: 0\n" +
                "и: 0\n" +
                "й: 0\n" +
                "к: 3\n" +
                "л: 0\n" +
                "м: 0\n" +
                "н: 0\n" +
                "о: 0\n" +
                "п: 3\n" +
                "р: 3\n" +
                "с: 3\n" +
                "т: 0\n" +
                "у: 0\n" +
                "ф: 3\n" +
                "х: 0\n" +
                "ц: 0\n" +
                "ч: 0\n" +
                "ш: 0\n" +
                "щ: 0\n" +
                "ъ: 3\n" +
                "ы: 0\n" +
                "ь: 0\n" +
                "э: 0\n" +
                "ю: 0\n" +
                "я: 0\n", out.toString());
    }

}