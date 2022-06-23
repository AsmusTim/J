import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


public class SolutionTest {

    private final ByteArrayOutputStream OutStream = new ByteArrayOutputStream();
    private final PrintStream OriginOut = System.out;
    public void PrintError(){System.out.print("Что-то не так!");}
    public void PrintAnsw(String n, int c, int a){ System.out.printf("%s  получает %d через %d", n, c, a); }

    @Before
    public void setOutStream(){
        System.setOut(new PrintStream(OutStream));
    }

    @Test
    public void NormInput() throws IOException {
        //setOutStream();
        ByteArrayInputStream in1 = new ByteArrayInputStream("Name".getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream("12".getBytes());
        ByteArrayInputStream in3 = new ByteArrayInputStream("34".getBytes());
        InputStream sysInBackup = System.in;
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

            if(!sc.hasNextInt()){PrintError(); return;} System.setIn(in2); count = sc.nextInt();

            if(!sc.hasNextInt()){PrintError(); return;} System.setIn(in3); age = sc.nextInt();
            PrintAnsw(name, count, age);
            return;
        }
        PrintError();
        assertEquals("Name  получает 12 через 34", OutStream.toString());
        //OutStream.flush();
    }
    @Test
    public void FirstInt() throws IOException {
        //setOutStream();
        ByteArrayInputStream in1 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream("12".getBytes());
        ByteArrayInputStream in3 = new ByteArrayInputStream("34".getBytes());
        InputStream sysInBackup = System.in;
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

            if(!sc.hasNextInt()){PrintError(); return;} System.setIn(in2); count = sc.nextInt();

            if(!sc.hasNextInt()){PrintError(); return;} System.setIn(in3); age = sc.nextInt();

            PrintAnsw(name, count, age);
            return;
        }
        PrintError();
        //OutStream.flush();
        assertEquals("Что-то не так!", OutStream.toString());
    }
    @Test
    public void SecondString() throws IOException {
        //setOutStream();
        ByteArrayInputStream in1 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream("String".getBytes());
        ByteArrayInputStream in3 = new ByteArrayInputStream("34".getBytes());
        InputStream sysInBackup = System.in;
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
            if(!sc.hasNextInt()){PrintError(); return;} count = sc.nextInt();
            System.setIn(in3);
            if(!sc.hasNextInt()){PrintError(); return;} age = sc.nextInt();

            PrintAnsw(name, count, age);
            return;
        }
        PrintError();
        //OutStream.flush();
        assertEquals("Что-то не так!", OutStream.toString());
    }
    @Test
    public void ThirdString() throws IOException {
        //setOutStream();
        ByteArrayInputStream in1 = new ByteArrayInputStream("1".getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream("23".getBytes());
        ByteArrayInputStream in3 = new ByteArrayInputStream("String".getBytes());
        InputStream sysInBackup = System.in;
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
            if(!sc.hasNextInt()){PrintError(); return;} count = sc.nextInt();
            System.setIn(in3);
            if(!sc.hasNextInt()){PrintError(); return;} age = sc.nextInt();

            PrintAnsw(name, count, age);
            return;
        }
        PrintError();
        //OutStream.flush();
        assertEquals("Что-то не так!", OutStream.toString());

    }
}