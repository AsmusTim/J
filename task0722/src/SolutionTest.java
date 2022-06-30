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
    String[] str = {"1", "abc", "45", "ff", "end"};

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }

    public void main(){
        int i = 0;
        System.setIn(new ByteArrayInputStream(str[i].getBytes()));

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String s = sc.nextLine();
        while (!s.equals("end")){
            i++;
            list.add(s);

            System.setIn(new ByteArrayInputStream(str[i].getBytes()));
            sc = new Scanner(System.in);
            s = sc.nextLine();
        }
        for(int j = 0; j < list.size(); ++j){
            System.out.println(list.get(j));
        }
    }

    @Test
    public void test(){
        main();
        assertEquals("1\nabc\n45\nff\n", out.toString());
    }

}