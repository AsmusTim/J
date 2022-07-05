import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Files.*;
import static org.junit.Assert.*;

public class SolutionTest {

    Path path = Path.of("test1.txt");

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void createData() throws IOException {
        System.setOut(new PrintStream(out));
        createFile(path);
        writeString(path, "Text");
    }

    @After
    public void delData() throws IOException {
        Files.delete(path);
    }

    @Test
    public void test() throws IOException {
        Solution.copyFile("test1.txt", "test1-copy.txt");
        assertEquals("Text", Files.readString(Path.of("test1-copy.txt")));
        Files.delete(Path.of("test1-copy.txt"));
    }

    @Test
    public void testOnExistsFile() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("test1.txt".getBytes());
        System.setIn(in);
        Solution.copyAndCheckFile("test0.txt", "test0-copy.txt");
        assertEquals("Файл не существует.\n", out.toString());
        delete(Path.of("test0-copy.txt"));
    }

}