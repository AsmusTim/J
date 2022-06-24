import org.junit.Before;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;
//import java.io.*;
import java.io.*;
import java.util.Scanner;

//import java.io.InputStream;


public class SolutionsTest {
    public final ByteArrayOutputStream OutStream = new ByteArrayOutputStream();
    //public final PrintStream OriginOut = System.out;

    public static void PrintErr(){System.out.print("Что-то не так!");}
    public static void PrintAnsw(String name){System.out.printf("%s зарабатывает 5 000$. Xa-xa-xa", name);}

    @Before
    public void setOutStream(){
        System.setOut(new PrintStream(OutStream));
    }

    @Test
    public void CorrectInput(){
        ByteArrayInputStream in = new ByteArrayInputStream("Name".getBytes());
        //InputStream sysInBackup = System.in;
        System.setIn(in);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        try {
            Integer.parseInt(name);
        }
        catch(NumberFormatException e){
            PrintAnsw(name);
            return;
        }
        PrintErr();
        assertEquals("Name зарабатывает 5 000$. Xa-xa-xa", OutStream.toString());
    }
    /*@Test
    public void FirstInt() {
        //setOutStream();
        ByteArrayInputStream in1 = new ByteArrayInputStream("1".getBytes());
        //InputStream sysInBackup = System.in;

        System.setIn(in1);

        Scanner sc = new Scanner(System.in);
        String name;

        name = sc.nextLine();
        try{
            Integer.parseInt(name);
        }
        catch (NumberFormatException e){
            PrintAnsw(name);
            //return;
        }
        PrintErr();
        //OutStream.flush();
        assertEquals("Что-то не так!", OutStream.toString());
    }*/
}