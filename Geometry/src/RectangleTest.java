import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle r;

    @Before
    public void createData(){
        r = new Rectangle();
    }

    @Test
    public void test1(){
        r.initialize(1, 1, 1, 1);
        assertEquals(4, r.getHeight() + r.getLeftX() + r.getLeftY() + r.getWidth(), 0.01);
    }
    @Test
    public void test2(){
        r.initialize(1, 1);
        assertEquals(1, r.getHeight(), 0.01);
        assertEquals(1, r.getWidth(), 0.01);
    }
    @Test
    public void test3(){
        r.initialize(1, 1, 5);
        assertEquals(5, r.getHeight(), 0.01);
        assertEquals(5, r.getWidth(), 0.01);
    }
}