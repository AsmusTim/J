import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person p1;
    Person p2;
    Person p3;

    @Before
    public void createData(){
        p1 = new Person("Name1", 2, "M", "p1");
        p2 = new Person("Name2", 3, "F", "p2");
        p3 = new Person();
    }

    @Test
    public void testNoEmpty(){
        assertTrue(p1 != null && p2 != null && p3 != null);
    }
    @Test
    public void testSetterName(){
        p1.setName("a");
        p2.setName("b");
        p3.setName("c");
        assertEquals("abc", p1.getName() + p2.getName() + p3.getName());
    }
    @Test
    public void testSetterAge(){
        p1.setAge(1);
        p2.setAge(2);
        p3.setAge(3);
        assertEquals(6, p1.getAge() + p2.getAge() + p3.getAge());
    }
    @Test
    public void testSetterSex(){
        p1.setSex("M ");
        p2.setSex(" f");
        p3.setSex(" abs ");
        assertEquals("MfNone", p1.getSex() + p2.getSex() + p3.getSex());
    }
    @Test
    public void testSetterAddress(){
        p1.setAddress("aa");
        p2.setAddress("bb");
        p3.setAddress("cc");
        assertEquals("aabbcc", p1.getAddress() + p2.getAddress() + p3.getAddress());
    }

}