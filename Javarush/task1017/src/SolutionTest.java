import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {

    ArrayList<Integer> arr = new ArrayList<>();

    @Before
    public void createData(){
        for(int i = 0; i < 20; ++i){
            arr.add(i);
        }
    }

    @Test
    public void test1(){
        assertEquals(4, Solution.safeGetElement(arr, 4, -1));
    }

    @Test
    public void test2(){
        assertEquals(-1, Solution.safeGetElement(arr, 31, -1));
    }

}