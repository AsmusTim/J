import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class SolutionTest {

    @Before
    public void createData(){
        Solution.set = new HashSet<>();
        String[] str = {"L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8", "L9", "L10", "L11", "L12", "L13", "L14", "L15", "L16", "L17", "L18", "L19", "L20"};
        for(String s: str){
            Solution.set.add(s);
        }

    }
    @Test
    public void test(){
        assertEquals(20, Solution.set.size());
    }

    @Test
    public void task0814(){
        Solution.setInt = new HashSet<>();
        Solution.init(Solution.setInt);
        Solution.delMoreTen(Solution.setInt);
        assertEquals(11, Solution.setInt.size());
    }

}