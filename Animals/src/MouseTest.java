import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MouseTest {


    /*=====================
    * = test for task0527 =
    * =====================*/

    Mouse m;
    Cat c;
    Dog d;

    @Before
    public void createData(){
        m = new Mouse("Jerry", 12, 10);
        c = new Cat("Tom", 3, 5);
        d = new Dog("Bob", 10);
    }

    @Test
    public void test(){
        assertTrue(m.getAddress() != null && m.getName() != null && m.getLenTail() != 0 && m.getGrowth() != 0);
        assertTrue(c.getAddress() != null && c.getName() != null && c.getAge() != 0 && c.getWeight() != 0);
        assertTrue(d.getAddress() != null && d.getName() != null && d.getAge() != 0);
    }

}