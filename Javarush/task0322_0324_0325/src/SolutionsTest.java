import org.junit.Test;
import org.junit.Before;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.BeforeTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Properties;

import static junit.framework.TestCase.assertEquals;


public class SolutionsTest {
    private final ByteArrayOutputStream Out = new ByteArrayOutputStream();

    @Before
    public void setOut() {
        System.setOut(new PrintStream(Out));
    }


    @Test
    public void task0322() {
        Solutions.task0322("A", "B", "C");
        assertEquals("A + B + C = Чистая любовь, да-да!\n", Out.toString());

    }

    @Test
    public void task0324() {
        Solutions.task0324(500);
        assertEquals("Я буду зарабатывать $ 500 в час", Out.toString());
    }

    @Test
    public void task0325() {
        Solutions.task0325();
        assertEquals("Я хочу большую зарплату, и для этого изучаю Java", Out.toString());
    }
}