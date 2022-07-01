import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void createData(){
        System.setOut(new PrintStream(out));
        String[] names = {"c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10"};
        for(int i = 0; i < 10; ++i){
            Solution.cats[i] = new Cat(names[i]);
        }

        Solution.hMapCat = new HashMap<>();
        for(int i = 0; i < 10; ++i){
            Solution.hMapCat.put(names[i], Solution.cats[i]);
        }
    }
    @Test
    public void test(){
        Set<String> set = Solution.hMapCat.keySet();
        for(int i = 0; i < 10; ++i){
            assertTrue(set.contains(Solution.cats[i].getName()));
        }

    }


}