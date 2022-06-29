import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AnimalTestFinalize {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void createData(){
        System.setOut(new PrintStream(out));
    }

    @Test
    public void simpleTestForFinalize(){
        for(int i = 0; i < 500_000; ++i){
            new Animal();
        }

        System.gc();
        
        assertEquals("Object is die", out.toString().substring(0, 13));
    }
    @Test
    public void simpleTestForFinalizeCat(){
        for(int i = 0; i < 4; ++i){
            new Cat();
        }

        assertEquals(4, Cat.catCounter);
    }

    /*=====================
    * = test for task0614 =
    * =====================*/
    @Test
    public void test(){
        for(int i = 0; i < 10; ++i){
            new Cat();
        }
        assertEquals(10, Cat.catCounter);
        Cat.printCat();
        assertEquals("Name\n" +
                "Name\n" +
                "Name\n" +
                "Name\n" +
                "Name\n" +
                "Name\n" +
                "Name\n" +
                "Name\n" +
                "Name\n" +
                "Name\n", out.toString());
    }

    /*======================
     * = test for task0619 =
     * =====================*/

    @Test
    public void test1(){
        assertEquals("cNamedName", Animal.cName + Animal.dName);
    }

}