import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    Cat bar;
    Cat mur;
    Cat cat;

    @Before
    public void data(){
        bar = new Cat("Barsik", 2, 3);
        mur = new Cat("Myrzik", 3, 5);
        cat = new Cat();
    }

    @Test
    public void test1(){
        assertTrue(bar != null && mur != null);
    }
    @Test
    public void testOnFight1(){
        assertTrue(!bar.fight(mur));
    }
    @Test
    public void testOnFight2(){
        assertTrue(mur.fight(bar));
    }
    @Test
    public void testSetterName(){
        cat.setName("Cat");
        assertEquals("Cat", cat.getName());
    }
    @Test
    public void testSetterAge(){
        cat.setAge(2);
        assertEquals(2, cat.getAge());
    }
    @Test
    public void testSetterWeight(){
        cat.setWeight(3);
        assertEquals(3, cat.getWeight());
    }
    @Test
    public void testChangeStrength1(){
        bar.setAge(4);
        assertEquals(2, bar.getStrength());
    }
    @Test
    public void testSetterStrength2(){
        bar.setWeight(10);
        assertEquals(18, bar.getStrength());
    }
}