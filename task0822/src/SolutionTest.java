import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getMinimum() {
        List<Integer> list = new ArrayList<>();
        int[] number = {2, 3, 123, 65, -32};
        for(int i: number){
            list.add(i);
        }
        assertEquals(-32, Solution.getMinimum(list));
    }
}