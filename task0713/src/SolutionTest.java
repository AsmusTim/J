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

        Solution.mainList = new ArrayList<>();
        Solution.forDiv3 = new ArrayList<>();
        Solution.forDiv2 = new ArrayList<>();
        Solution.forAny = new ArrayList<>();
        String[] in = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

        Scanner sc;
        for(int i = 0; i < 20; ++i){
            System.setIn(new ByteArrayInputStream(in[i].getBytes()));
            sc = new Scanner(System.in);
            Solution.mainList.add(sc.nextInt());
        }
    }
    @Test
    public void test(){
        for(int i: Solution.mainList){
            if(i % 2 == 0 || i % 6 == 0){ Solution.forDiv2.add(i); }
            else if(i % 3 == 0 || i % 6 == 0){ Solution.forDiv3.add(i); }
            else {Solution.forAny.add(i);}
        }
        Solution.printList();
        assertEquals("3\n" +
                "9\n" +
                "15\n" +
                "2\n" +
                "4\n" +
                "6\n" +
                "8\n" +
                "10\n" +
                "12\n" +
                "14\n" +
                "16\n" +
                "18\n" +
                "20\n" +
                "1\n" +
                "5\n" +
                "7\n" +
                "11\n" +
                "13\n" +
                "17\n" +
                "19\n", out.toString());
    }

}