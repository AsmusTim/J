import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FriendTest {

    Friend f;

    @Before
    public void createData(){
        f = new Friend();
    }

    @Test
    public void test1(){
        f.initialize("Name");
        assertEquals("Name", f.getName());
    }
    @Test
    public void test2(){
        f.initialize("Name", 2);
        assertEquals(2, f.getAge());
    }
    @Test
    public void test3(){
        f.initialize("Name", 2, 'f');
        assertEquals('f', f.getSex());
    }

}