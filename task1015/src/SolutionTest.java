import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {


    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void createData(){
        System.setOut(new PrintStream(out));

        Solution.arrayLists = new ArrayList[2];
        Solution.arrayLists[0] = new ArrayList<String>();
        Solution.arrayLists[0].add("11");
        Solution.arrayLists[0].add("22");
        Solution.arrayLists[1] = new ArrayList<String>();
        Solution.arrayLists[1].add("33");
        Solution.arrayLists[1].add("44");
    }

    @Test
    public void test(){
        for(ArrayList<String> aL: Solution.arrayLists){
            for(String s: aL){
                System.out.print(s + " ");
            }
            System.out.println();
        }

        assertEquals("11 22 \n33 44 \n", out.toString());
    }

}