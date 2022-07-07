import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class SolutionTest {

    Map<String, Solution.Cat> map;

    @Before
    public void createData(){
        map = Solution.createMap();
    }

    @Test
    public void test(){
        Set<Solution.Cat> set = Solution.convertMapToSet(map);
        assertEquals(10, set.size());
    }
}