import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class HumanTest {

    Human grandPaF;
    Human grandMaF;
    Human grandPaM;
    Human grandMaM;
    Human father;
    Human mother;
    Human child1;
    Human child2;
    Human child3;
    Human[] h;

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){
        System.setOut(new PrintStream(out));
        grandPaF = new Human("a");
        grandMaF = new Human("b");
        grandPaM = new Human("c");
        grandMaM = new Human("d");
        father = new Human("e", grandPaF, grandMaF);
        mother = new Human("f", grandPaM, grandMaM);
        child1 = new Human("g", father, mother);
        child2 = new Human("h", father, mother);
        child3 = new Human("m", father, mother);
        h = new Human[]{grandPaF, grandMaF, grandPaM, grandMaM, father, mother, child1, child2, child3};
    }

    @Test
    public void test(){
        for(int i = 0; i < 9; ++i){
            System.out.println(h[i]);
        }
        assertEquals("Name: a, no father, no mother\n" +
                "Name: b, no father, no mother\n" +
                "Name: c, no father, no mother\n" +
                "Name: d, no father, no mother\n" +
                "Name: e, father Name: a, no father, no mother, mother Name: b, no father, no mother\n" +
                "Name: f, father Name: c, no father, no mother, mother Name: d, no father, no mother\n" +
                "Name: g, father Name: e, father Name: a, no father, no mother, mother Name: b, no father, no mother, mother Name: f, father Name: c, no father, no mother, mother Name: d, no father, no mother\n" +
                "Name: h, father Name: e, father Name: a, no father, no mother, mother Name: b, no father, no mother, mother Name: f, father Name: c, no father, no mother, mother Name: d, no father, no mother\n" +
                "Name: m, father Name: e, father Name: a, no father, no mother, mother Name: b, no father, no mother, mother Name: f, father Name: c, no father, no mother, mother Name: d, no father, no mother\n", out.toString());
    }




}