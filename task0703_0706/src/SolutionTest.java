import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SolutionTest {

    int[] arrIntTask0703;
    String[] arrStrTask0703;
    String[] ts73;

    int[] arrIntTask0704;
    String[] ts74;

    int[] bigArrTask0705;
    int[] small1ArrTask0705;
    int[] small2ArrTask0705;

    int[] arrTask0706;
    ByteArrayOutputStream out = new ByteArrayOutputStream();


    @Before
    public void createData(){
        System.setOut(new PrintStream(out));

        //task0703
        arrIntTask0703 = new int[10];
        arrStrTask0703 = new String[10];

        ts73 = new String[10];

        for(int i = 0; i < 10; ++i){
            ts73[i] = "qwe";
        }

        //task0704
        arrIntTask0704 = new int[10];
        ts74 = new String[10];
        for(int i = 0; i < 10; ++i){
            ts74[i] = "" + i;
        }

        //task0705
        bigArrTask0705 = new int[20];
        for(int i = 0; i < 20; ++i){bigArrTask0705[i] = i;}
        small1ArrTask0705 = new int[10];
        small2ArrTask0705 = new int[10];

        //task0706
        arrTask0706 = new int[15];
        for(int i = 0; i < 15; ++i){
            arrTask0706[i] = i;
        }
    }

    @Test
    public void task0703() throws IOException {
        Scanner sc;
        for(int i = 0; i < 10; ++i) {
            System.setIn(new ByteArrayInputStream(ts73[i].getBytes()));
            sc = new Scanner(System.in);
            arrStrTask0703[i] = sc.nextLine();
        }
        int sum = 0;
        for(int i = 0; i < 10; ++i){
            arrIntTask0703[i] = arrStrTask0703[i].length();
            sum += arrIntTask0703[i];
        }
        assertEquals(3 * 10, sum);

    }

    @Test
    public void task0704(){
        Scanner sc;
        for(int i = 0; i < 10; ++i){
            System.setIn(new ByteArrayInputStream(ts74[i].getBytes()));
            sc = new Scanner(System.in);
            arrIntTask0704[i] = sc.nextInt();
        }
        for(int i = arrIntTask0704.length - 1; i > -1; --i){
            System.out.println(arrIntTask0704[i]);
        }
        assertEquals("9\n8\n7\n6\n5\n4\n3\n2\n1\n0\n", out.toString());
    }
    @Test
    public void task0705(){
        small1ArrTask0705 = Arrays.copyOf(bigArrTask0705, 10);
        small2ArrTask0705 = Arrays.copyOfRange(bigArrTask0705, 10, 20);
        for(int i: small2ArrTask0705){
            System.out.println(i);
        }
        assertEquals("10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n", out.toString());
    }
    @Test
    public void task0706(){
        int even = 0, odd = 0;
        String msg1 = "В домах с нечетными номерами проживает больше жителей.";
        String msg2 = "В домах с четными номерами проживает больше жителей.";
        for(int i: arrTask0706){
            if(i % 2 == 0){even++;}
            else{odd++;}
        }
        System.out.print(even > odd ? msg2 : msg1);
        assertEquals(msg2, out.toString());
    }

}