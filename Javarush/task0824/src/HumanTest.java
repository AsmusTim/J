import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.SortedMap;

import static org.junit.Assert.*;

public class HumanTest {


    Human gf1;
    Human gm1;
    Human gf2;
    Human gm2;
    Human f;
    Human m;
    Human c1;
    Human c2;
    Human c3;

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void createData(){
        System.setOut(new PrintStream(out));
        Human gf1 = new Human("a");
        Human gm1 = new Human("b");
        Human gf2 = new Human("c");
        Human gm2 = new Human("d");
        Human f   = new Human("e");
        Human m   = new Human("f");
        Human c1  = new Human("g");
        Human c2  = new Human("h");
        Human c3  = new Human("k");
    }

}