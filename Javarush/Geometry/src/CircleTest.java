import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    Circle c;

    @Before
    public void createData(){
        c = new Circle();
    }

    @Test
    public void test1(){
        c.initialize(3.3, 2.2, 1);
        assertEquals(1.1, c.getWidth(), 0.01);
        assertEquals("Black", c.getColor());
    }
    @Test
    public void test2(){
        c.initialize(3.3, 2.2, 1, 3.33);
        assertEquals("Black", c.getColor());
    }
    @Test
    public void test3(){
        c.initialize(3.3, 2.2, 1, 3.33, "Red");
        assertEquals("Red", c.getColor());
        assertEquals(3.3, c.getCenterX(), 0.01);
        assertEquals(2.2, c.getCenterY(), 0.01);
        assertEquals(1, c.getRadius(), 0.01);
        assertEquals(3.33, c.getWidth(), 0.01);
    }

}