import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {

    @Before
    public void createDate(){
        Solution.addresses = new ArrayList<>();
        String[] family = {"1", "2", "3", "4"};
        String[] city = {"a", "b", "c", "d"};
        for(int i = 0; i < 4; ++i){
            Solution.addresses.add(family[i]);
            Solution.addresses.add(city[i]);
        }
    }

    @Test
    public void test(){
        assertEquals("2", Solution.getFamily("b"));
        assertEquals("4", Solution.getFamily("d"));
        assertEquals("", Solution.getFamily("32"));
    }

}