import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    Circle circle;

    @Before
    public void createData(){
        circle = new Circle();
        circle.color.setDescription("Red");
    }

    @Test
    public void test(){
        assertEquals("Red", circle.color.getDescription());
    }

}