import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    ByteArrayInputStream index1 = new ByteArrayInputStream("1".getBytes());
    ByteArrayInputStream index2 = new ByteArrayInputStream("2".getBytes());
    ByteArrayInputStream name1 = new ByteArrayInputStream("n1".getBytes());
    ByteArrayInputStream name2 = new ByteArrayInputStream("n2".getBytes());
    ByteArrayInputStream[] ins = {index1, index2, name1, name2};


    @Before
    public void createData(){
        System.setOut(new PrintStream(out));
    }

    @Test
    public void test(){
        Scanner intIn;
        Scanner strIn;
        for (int i = 0; i < 2; i++) {
            System.setIn(ins[i]);
            intIn = new Scanner(System.in);
            int index = intIn.nextInt();

            System.setIn(ins[i + 2]);
            strIn = new Scanner(System.in);
            String name = strIn.nextLine();

            Solution.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : Solution.map.entrySet()) {
            Solution.index = pair.getKey();
            Solution.name = pair.getValue();
            System.out.println("Id=" + Solution.index + " Name=" + Solution.name);
        }

        assertEquals("Id=1 Name=n1\n" +
                "Id=2 Name=n2\n", out.toString());
    }


}