import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution room;

    @Before
    public void createData(){
        room = new Solution();
        room.A = 5;
    }

    @Test
    public void test(){
        assertEquals(50, room.C);
        assertEquals(5, room.getA());
    }

}