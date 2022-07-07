import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    public Solution.Cat c;

    @Before
    public void createCat(){
        c = new Solution.Cat();
    }

    @Test
    public void main() {
        assertEquals(1, c.getCatsCount());
    }
}