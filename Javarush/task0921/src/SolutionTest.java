import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }

    @Test
    public void test(){
        ByteArrayInputStream in1 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream("2".getBytes());
        ByteArrayInputStream in3 = new ByteArrayInputStream("d".getBytes());
        ByteArrayInputStream[] ins = {in1, in2, in3};

        BufferedReader reader;
        List<Integer> list = new ArrayList<>();
        int j = 0;
        try {
            while(true) {
                reader = new BufferedReader(new InputStreamReader(ins[j]));
                int a = Integer.parseInt(reader.readLine());
                list.add(a);
                j++;
            }
        } catch (NumberFormatException e) {
            for(int i: list){
                System.out.println(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        assertEquals("1\n2\n", out.toString());
    }

}