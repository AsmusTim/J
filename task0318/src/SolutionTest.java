//import org.testng.annotations.Test;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final ByteArrayOutputStream OutStream = new ByteArrayOutputStream();
    private final PrintStream OriginOut = System.out;

    public static void PrintError(){ System.out.print("Что-то не так!"); }
    public static void PrintAnsw(String n, int t){System.out.println(String.format("%s захватит мир через %d лет. Му-ха-ха", n, t));}

    @Before
    public void setOutStream(){
        System.setOut(new PrintStream(OutStream));
    }
    @Test
    public void AllOk() {
        
        ByteArrayInputStream in1 = new ByteArrayInputStream("Name".getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream("12345".getBytes());
        InputStream sysInBackup = System.in;
        System.setIn(in1);

        Scanner sc = new Scanner(System.in);
        String name;
        int time;

        name = sc.nextLine();
        try{
            Integer.parseInt(name);
        }
        catch (NumberFormatException e){
            if(!sc.hasNextInt()){PrintError(); return;} System.setIn(in2); time = sc.nextInt();

            PrintAnsw(name, time);
            return;
        }
        PrintError();
        assertEquals("Name захватит мир через 12345 лет. Му-ха-ха", OutStream.toString());
    }
    @Test
    public void FirstInt() {
        ByteArrayInputStream in1 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream("12345".getBytes());
        InputStream sysInBackup = System.in;
        System.setIn(in1);

        Scanner sc = new Scanner(System.in);
        String name;
        int time;

        name = sc.nextLine();
        try{
            Integer.parseInt(name);
        }
        catch (NumberFormatException e){
            if(!sc.hasNextInt()){PrintError(); return;} System.setIn(in2);
            time = sc.nextInt();

            PrintAnsw(name, time);
            return;
        }
        PrintError();
        assertEquals("Что-то не так!", OutStream.toString());
    }
    @Test
    public void SecondString() {
        
        ByteArrayInputStream in1 = new ByteArrayInputStream("Name".getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream("String".getBytes());
        InputStream sysInBackup = System.in;
        System.setIn(in1);

        Scanner sc = new Scanner(System.in);
        String name;
        int time;

        name = sc.nextLine();
        try{
            Integer.parseInt(name);
        }
        catch (NumberFormatException e){
            if(!sc.hasNextInt()){PrintError(); return;} System.setIn(in2); time = sc.nextInt();

            PrintAnsw(name, time);
            return;
        }
        PrintError();
        assertEquals("Что-то не так!", OutStream.toString());
    }
}
