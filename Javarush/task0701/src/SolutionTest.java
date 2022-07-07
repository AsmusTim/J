import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void initializeArrayTest() throws IOException {
        ByteArrayInputStream in1 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in3 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in4 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in5 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in6 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in7 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in8 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in9 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in10 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in11 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in12 = new ByteArrayInputStream("9".getBytes());
        ByteArrayInputStream in13 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in14 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in15 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in16 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in17 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in18 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in19 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in20 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream[] ins = {in1, in2, in3, in4, in5, in6, in7, in8, in9, in10, in11, in12, in13, in14, in15, in16, in17, in18, in19, in20};

        int[] arr = new int[20];

        for(int i = 0; i < 20; ++i){
            BufferedReader reader = new BufferedReader(new InputStreamReader(ins[i]));
            arr[i] = Integer.parseInt(reader.readLine());
        }

        assertEquals(9, Solution.getMaxFromArray(arr));

    }

}