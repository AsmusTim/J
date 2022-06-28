import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTestFightCat {

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    Cat bar;
    Cat mur;
    Cat gar;

    @Before
    public void setData(){
        System.setOut(new PrintStream(out));
        bar = new Cat("Barsik", 2, 4);
        mur = new Cat("Murzik", 3, 5);
        gar = new Cat("Garfild", 3, 15);
    }

    @Test
    public void fightCat() {
        Solution.fightCat(bar, mur);
        Solution.fightCat(bar, gar);
        Solution.fightCat(mur, gar);
        assertEquals("Murzik win Barsik\n" +
                "Garfild win Barsik\n" +
                "Garfild win Murzik\n", out.toString());
    }
}