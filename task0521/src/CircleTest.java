import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    Circle c1;
    Circle c2;

    @Before
    public void createData(){
        c1 = new Circle();
        c2 = new Circle(1, 2);
    }

    @Test
    public void testOnDefaultValues(){
        assertEquals(5, c1.x, 0.01);
        assertEquals(5, c1.y, 0.01);
        assertEquals(1, c1.radius, 0.01);
    }
    @Test
    public void testOnHalfDefaultValues(){
        assertEquals(10, c2.radius, 0.01);
    }

}