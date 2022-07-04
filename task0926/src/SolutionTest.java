import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {

    @Before
    public void createData(){
        Solution.list = new ArrayList<>();
        Solution.list.add(new int[5]);
        Solution.list.add(new int[2]);
        Solution.list.add(new int[4]);
        Solution.list.add(new int[7]);
        Solution.list.add(new int[0]);
    }


    @Test
    public void test(){
        assertEquals(5, Solution.list.size());
        assertEquals(5, Solution.list.get(0).length);
        assertEquals(2, Solution.list.get(1).length);
        assertEquals(4, Solution.list.get(2).length);
        assertEquals(7, Solution.list.get(3).length);
        assertEquals(0, Solution.list.get(4).length);
    }
}