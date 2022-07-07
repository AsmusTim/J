import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    /*=====================
    * = test for task0526 =
    * =====================*/

    People.Man m1;
    People.Man m2;
    People.Man m3;
    People.Man m4;
    People.Woman w1;
    People.Woman w2;
    People.Woman w3;
    People.Woman w4;

    @Before
    public void createData() {
        m1 = new People.Man();
        m2 = new People.Man("M2");
        m3 = new People.Man("M3", 25);
        m4 = new People.Man("M4", 30, "SPB");
        w1 = new People.Woman();
        w2 = new People.Woman("W2");
        w3 = new People.Woman("W3", 38);
        w4 = new People.Woman("W4", 28, "MSK");
    }

    @Test
    public void testForM1(){
        assertEquals("Name", m1.getName());
        assertEquals(20, m1.getAge());
        assertEquals("None", m1.getAddress());
    }
    @Test
    public void testForM2(){
        assertEquals(20, m2.getAge());
        assertEquals("None", m2.getAddress());
    }
    @Test
    public void testForM3(){
        assertEquals("None", m3.getAddress());
    }
    @Test
    public void testForM4(){
        assertEquals("M4", m4.getName());
        assertEquals(30, m4.getAge());
        assertEquals("SPB", m4.getAddress());
    }

    @Test
    public void testForW1(){
        assertEquals("Name", w1.getName());
        assertEquals(20, w1.getAge());
        assertEquals("None", w1.getAddress());
    }
    @Test
    public void testForW2(){
        assertEquals(20, w2.getAge());
        assertEquals("None", w2.getAddress());
    }
    @Test
    public void testForW3(){
        assertEquals("None", w3.getAddress());
    }
    @Test
    public void testForW4(){
        assertEquals("W4", w4.getName());
        assertEquals(28, w4.getAge());
        assertEquals("MSK", w4.getAddress());
    }


}