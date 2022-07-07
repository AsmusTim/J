import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class DogTest {

    Dog tuz;
    Dog shr;
    Dog bob;

    @Before
    public void setData(){
        tuz = new Dog("Tuzik", 2);
        shr = new Dog("Sharik", 3);
        bob = new Dog();
    }

    @Test
    public void testOnExist(){
        assertTrue(tuz != null && shr != null);
    }
    @Test
    public void testOnGettersAndSettersName(){
        bob.setName("Bobik");
        assertEquals("Bobik", bob.getName());
    }
    @Test
    public void testOnGettersAndSettersAge(){
        bob.setAge(5);
        assertEquals(5, bob.getAge());
    }
}