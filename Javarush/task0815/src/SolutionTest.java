import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;

import static org.junit.Assert.*;

public class SolutionTest {

    @Before
    public void createData(){
        Solution.nameMap = new HashMap<>(); //task0815, task0817
        Solution.dateMap = new HashMap<>(); //task0816
        Solution.salaryMap = new HashMap<>(); //task0818

        String[] surName = {"q", "w", "e", "r", "t", "y", "u", "a", "s", "d"};
        String[] name = {"q", "q", "w", "e", "q", "e", "o", "a", "v", "c"};
        Date[] dates = {new Date(2002, 4, 23), new Date(2002, 5, 23), new Date(2002, 7, 23),
                        new Date(2002, 8, 23), new Date(2002, 0, 23), new Date(2002, 6, 23),
                        new Date(2002, 0, 23), new Date(2002, 3, 23), new Date(2002, 1, 23),
                        new Date(2002, 9, 23)};

        for(int i = 0; i < 10; ++i){
            Solution.nameMap.put(surName[i], name[i]);
            Solution.dateMap.put(surName[i], dates[i]);
            Solution.salaryMap.put(surName[i], i * 100);
        }
    }

    @Test
    public void task0815(){
        assertEquals(3, Solution.getCountRepeatName("q", Solution.nameMap));
    }
    @Test
    public void task0816(){
        Solution.delBornSummer(Solution.dateMap);
        assertEquals(7, Solution.dateMap.size());
    }

    @Test
    public void task0817(){
        Solution.delRepeatName(Solution.nameMap);
        assertEquals(7, Solution.nameMap.size());
    }
    @Test
    public void task0818(){
        Solution.delIfSalaryLow500(Solution.salaryMap);
        assertEquals(5, Solution.salaryMap.size());
    }
}