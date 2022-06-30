import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CatTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void createData(){
        System.setOut(new PrintStream(out));

        Cat catGrandpa = new Cat("a");
        Cat catGrandma = new Cat("b");
        Cat catFather = new Cat("c", null, catGrandpa);
        Cat catMother = new Cat("d", catGrandma, null);
        Cat catSon = new Cat("i", catMother, catFather);
        Cat catDaughter = new Cat("f", catMother, catFather);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    @Test
    public void test(){
        assertEquals("Cat name is a, no mother, no father\n" +
                "Cat name is b, no mother, no father\n" +
                "Cat name is c, father is Cat name is a, no mother, no father, no mother\n" +
                "Cat name is d, no father, mother is Cat name is b, no mother, no father\n" +
                "Cat name is i, father is ,Cat name is c, father is Cat name is a, no mother, no father, no mothermother is Cat name is d, no father, mother is Cat name is b, no mother, no father\n" +
                "Cat name is f, father is ,Cat name is c, father is Cat name is a, no mother, no father, no mothermother is Cat name is d, no father, mother is Cat name is b, no mother, no father\n", out.toString());
    }

}