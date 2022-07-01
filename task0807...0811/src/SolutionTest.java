import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class SolutionTest {

    @Before
    public void createData(){
        Solution.list = new ArrayList<>();
        Solution.linkList = new LinkedList<>();
    }

    @Test
    public void task0808Task0809(){
        long l1 = Solution.getTimeMsOfInsert(Solution.list);
        long l2 = Solution.getTimeMsOfInsert(Solution.linkList);
        assertTrue(l1 > l2);
    }

}