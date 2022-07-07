import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test(){
        ArrayList<Integer> list = new ArrayList<>();
        int[] ints = {1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 6, 6, 7};
        for(int i: ints){
            list.add(i);
        }
        assertEquals(5, Solution.getLenMaxLine(list));
    }

}