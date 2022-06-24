import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final ByteArrayOutputStream OutStream = new ByteArrayOutputStream();

    public static void PrintError(){ System.out.print("Что-то не так!"); }
    public static void PrintAnsw(String n, int t){System.out.println(String.format("%s захватит мир через %d лет. Му-ха-ха", n, t));}

    public void func(String s1, String s2){
        ByteArrayInputStream in1 = new ByteArrayInputStream(s1.getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream(s2.getBytes());

        System.setIn(in1);
        Scanner sc = new Scanner(System.in);

        String name;
        int time;

        name = sc.nextLine();
        try{
            Integer.parseInt(name);
        }
        catch (NumberFormatException e){
        
            System.setIn(in2);
            sc = new Scanner(System.in);
            if(!sc.hasNextInt()){
                PrintError();
                return;
            }

            time = sc.nextInt();
            PrintAnsw(name, time);
            return;
        }
        PrintError();
    }

    @Before
    public void setOutStream(){
        System.setOut(new PrintStream(OutStream));
    }

    @Test
    public void AllOk() {

        func("Name", "12345");
        assertEquals("Name захватит мир через 12345 лет. Му-ха-ха\n", OutStream.toString());
    }
    @Test
    public void FirstInt() {
        func("1", "12345");

        assertEquals("Что-то не так!", OutStream.toString());
    }
    @Test
    public void SecondString() {

        func("Name", "String");
        assertEquals("Что-то не так!", OutStream.toString());
    }
}
