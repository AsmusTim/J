import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTestInitalize {

    Dog d;

    @Before
    public void createData(){d = new Dog();}

    @Test
    public void test1(){
        d.initialize("name");
        assertEquals(2, d.getAge());
        assertEquals(1, d.getGrowth(), 0.01);
        assertEquals("Brown", d.getColor());
    }
    @Test
    public void test2(){
        d.initialize("name", (float) 3.2);
        assertEquals(2, d.getAge());
        assertEquals("Brown", d.getColor());
    }
    @Test
    public void test3(){
        d.initialize("name", (float) 4.2, "Black");
        assertEquals(2, d.getAge());
    }

}