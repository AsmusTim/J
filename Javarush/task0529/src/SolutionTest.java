import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {

    ArrayList<Integer> list = new ArrayList<>();

    @Before
    public void createData(){
        for(int i = 1; i < 11; i++){
            list.add(i);
        }
    }

    @Test
    public void test(){
        assertEquals(55, Solution.getSum(list));
    }

}