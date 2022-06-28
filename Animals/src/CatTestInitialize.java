import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTestInitialize {
    Cat c;

    @Before
    public void createData(){
        c = new Cat();
    }

    @Test
    public void test1(){
        c.initialize("Name");
        assertEquals(1, c.getAge());
        assertEquals(3, c.getWeight());
        assertEquals("None", c.getAddress());
        assertEquals("black", c.getColor());
    }
    @Test
    public void test2(){
        c.initialize("Name", 3);
        assertEquals(3, c.getWeight());
        assertEquals("None", c.getAddress());
        assertEquals("black", c.getColor());
    }
    @Test
    public void test3(){
        c.initialize(10, "white");
        assertEquals("Cat", c.getName());
        assertEquals(1, c.getAge());
        assertEquals("None", c.getAddress());
    }
    @Test
    public void test4(){
        c.initialize("Name", 3, 3);
        assertEquals("None", c.getAddress());
        assertEquals("black", c.getColor());
    }
    @Test
    public void test5(){
        c.initialize(3, "white", "SPB");
        assertEquals(1, c.getAge());
        assertEquals(3, c.getWeight());
    }

}