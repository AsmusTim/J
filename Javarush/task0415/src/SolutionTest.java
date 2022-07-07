import org.junit.Before;
import org.junit.Test;

import java.beans.BeanProperty;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOutput(){
        System.setOut(new PrintStream(out));
    }

    @Test
    public void existsTriangle() {
        Solution.existsTriangle(7, 5, 3);
        assertEquals("Треугольник существует.", out.toString());
    }
    @Test
    public void noExistsTriangle() {
        Solution.existsTriangle(1, 5, 3);
        assertEquals("Треугольник не существует.", out.toString());
    }
}