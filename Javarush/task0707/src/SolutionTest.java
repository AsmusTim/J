import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void createData(){
        System.setOut(new PrintStream(out));
        Solution.arList = new ArrayList<>();
        String[] str = {"qwe", "qwer", "qwert", "uio", "pass"};
        Scanner sc;
        for(int i = 0; i < 5; ++i){
            System.setIn(new ByteArrayInputStream(str[i].getBytes()));
            sc = new Scanner(System.in);
            Solution.arList.add(sc.nextLine());
        }

        Solution.arrList = new ArrayList<>();
        String[] str1 = {"qwe", "qwer", "qwert", "uio", "pass", "qwerty", "12345", "6789", "abcd", "123987"};
        for(int i = 0; i < 10; ++i){
            System.setIn(new ByteArrayInputStream(str1[i].getBytes()));
            sc = new Scanner(System.in);
            Solution.arrList.add(0, sc.nextLine());
        }
    }

    @Test
    public void task0707(){
        assertEquals(5, Solution.arList.size());
        for(int i = 0; i < 5; ++i){
            System.out.println(Solution.arList.get(i));
        }
        assertEquals("qwe\nqwer\nqwert\nuio\npass\n", out.toString());
    }
    @Test
    public void task0708(){
        int len = 0;
        for(int o = 0; o < 5; ++o){
            int l = Solution.arList.get(o).length();
            if(l > len){len = l;}
        }
        for(int i = 0; i < 5; ++i){
            if(Solution.arList.get(i).length() == len){System.out.println(Solution.arList.get(i));}
        }
        assertEquals("qwert\n", out.toString());
    }
    @Test
    public void task0709(){
        int len = Integer.MAX_VALUE;
        for(int o = 0; o < 5; ++o){
            int l = Solution.arList.get(o).length();
            if(l < len){len = l;}
        }
        for(int i = 0; i < 5; ++i){
            if(Solution.arList.get(i).length() == len){System.out.println(Solution.arList.get(i));}
        }
        assertEquals("qwe\nuio\n", out.toString());
    }
    @Test
    public void task0710(){
        for(int i = 0; i < 10; ++i){
            System.out.println(Solution.arrList.get(i));
        }
        assertEquals("123987\nabcd\n6789\n12345\nqwerty\npass\nuio\nqwert\nqwer\nqwe\n", out.toString());
    }
    @Test
    public void task0711(){
        for(int i = 0; i < 13; ++i){
            String m = Solution.arList.get(Solution.arList.size() - 1);
            Solution.arList.remove(Solution.arList.size() - 1);
            Solution.arList.add(0, m);
        }
        for(int i = 0; i < Solution.arList.size(); ++i){
            System.out.println(Solution.arList.get(i));
        }
        assertEquals("qwert\n" +
                "uio\n" +
                "pass\n" +
                "qwe\n" +
                "qwer\n", out.toString());
    }
    @Test
    public void task0712(){
        int minLen = Integer.MAX_VALUE, maxLen = 0;
        for(int i = 0; i < 10; ++i){
            int l = Solution.arrList.get(i).length();
            if(maxLen < l){ maxLen = l; }
            if(minLen > l){ minLen = l; }
        }
        for(int i = 0; i < 10; ++i){
            if(Solution.arrList.get(i).length() == maxLen || Solution.arrList.get(i).length() == minLen){System.out.print(Solution.arrList.get(i)); break;}
        }
        assertEquals("123987", out.toString());
    }
    @Test
    public void task0714(){
        Solution.arList.remove(2);
        for(int i = Solution.arList.size() - 1; i > -1; --i){
            System.out.println(Solution.arList.get(i));
        }
        assertEquals("pass\nuio\nqwer\nqwe\n", out.toString());
    }
    @Test
    public void task0715(){
        Solution.main(null);
        assertEquals("Mama\n" +
                "именно\n" +
                "Мыла\n" +
                "именно\n" +
                "Раму\n" +
                "именно\n", out.toString());
    }
    @Test
    public void task0716(){
        ArrayList<String> list = new ArrayList<>();
        list.add("роза");
        list.add("лира");
        list.add("лоза");
        list.add("л");
        Solution.fix(list);
        for(String i: list){ System.out.println(i); }
        assertEquals("лира\n" +
                "лоза\n" +
                "л\n" +
                "лоза\n" +
                "л\n" +
                "лоза\n", out.toString());
    }

}