import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;


public class SolutionTest {

    private final ByteArrayOutputStream OutStream = new ByteArrayOutputStream();
    public void PrintError(){System.out.print("Что-то не так!");}
    public void PrintAnsw(String n, int c, int a){ System.out.printf("%s  получает %d через %d", n, c, a); }
    
    public void func(String s1, String s2, String s3){
        ByteArrayInputStream in1 = new ByteArrayInputStream(s1.getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream(s2.getBytes());
        ByteArrayInputStream in3 = new ByteArrayInputStream(s3.getBytes());

        System.setIn(in1);
        Scanner sc = new Scanner(System.in);
        int count;
        int age;
        String name;

        name = sc.nextLine();
        try{
            Integer.parseInt(name);
        }
        catch (NumberFormatException e){
            System.setIn(in2);
            sc = new Scanner(System.in);
            if(!sc.hasNextInt()){PrintError(); return;}  count = sc.nextInt();

            System.setIn(in3);
            sc = new Scanner(System.in);
            if(!sc.hasNextInt()){PrintError(); return;}  age = sc.nextInt();
            PrintAnsw(name, count, age);
            return;
        }
        PrintError();
    }

    @Before
    public void setOutStream(){
        System.setOut(new PrintStream(OutStream));
    }

    @Test
    public void NormInput()   {
        func("Name", "12", "34");
        assertEquals("Name  получает 12 через 34", OutStream.toString());
    }
    @Test
    public void FirstInt(){
        func("1", "1", "1");
        assertEquals("Что-то не так!", OutStream.toString());
    }
    @Test
    public void SecondString(){
        func("S", "S", "1");
        assertEquals("Что-то не так!", OutStream.toString());
    }
    @Test
    public void ThirdString(){
        func("S", "1", "S");
        assertEquals("Что-то не так!", OutStream.toString());

    }
}