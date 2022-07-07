import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        existsTriangle(a, b, c);

    }
    public static void existsTriangle(double a, double b, double c){
        if(a + b > c && a + c > b && b + c > a){System.out.print("Треугольник существует.");}
        else{System.out.print("Треугольник не существует.");}
    }
}
