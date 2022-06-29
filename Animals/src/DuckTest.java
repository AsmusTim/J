import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuckTest {

    /*============================
    * =    test for task0525     =
    * ============================*/


    Cat garfild;
    Dog guffy;
    Duck donald;

    @Before
    public void createData(){
        garfild = new Cat();
        guffy = new Dog();
        donald = new Duck();
    }

    @Test
    public void test(){
        assertEquals("Cat", garfild.toString());
        assertEquals("Dog", guffy.toString());
        assertEquals("Duck", donald.toString());
    }

}