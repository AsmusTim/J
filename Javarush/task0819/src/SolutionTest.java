import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Iterator;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void createData(){
        System.setOut(new PrintStream(out));
    }

    @Test
    public void task0819(){
        Solution.Cat.createCat();
        Solution.Cat cat = Solution.Cat.catSet.iterator().next();
        Solution.Cat.catSet.remove(cat);
        for(Solution.Cat c: Solution.Cat.catSet){System.out.println(c);}
        assertEquals("Murzik\nMurzik\n", out.toString());
    }
    @Test
    public void task0820(){
        Solution.Cat.createCat();
        Solution.Dog.createDogs();
        Solution.join();
        Solution.removeCats();
        assertEquals(3, Solution.pets.size());
    }

}