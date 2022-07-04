import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution.LittleRedRidingHood l;
    Solution.Grandmother g;
    Solution.Patty p;
    Solution.Wolf w;
    Solution.Woodman wo;
    ArrayList<Solution.StoryItem> killed;
    ArrayList<Solution.StoryItem> ate;

    @Before
    public void createData(){
        l = new Solution.LittleRedRidingHood();
        g = new Solution.Grandmother();
        p = new Solution.Patty();
        w = new Solution.Wolf();
        wo = new Solution.Woodman();

        killed = new ArrayList<Solution.StoryItem>();
        ate = new ArrayList<Solution.StoryItem>();

        w.ate.add(g);
        w.ate.add(l);
        wo.killed.add(w);
    }


    @Test
    public void test(){
        assertEquals(2, w.ate.size());
        assertEquals(1, wo.killed.size());
    }
}