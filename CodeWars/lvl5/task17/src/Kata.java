//https://www.codewars.com/kata/5263a84ffcadb968b6000513

import java.util.Arrays;
import java.util.Comparator;

public class Kata {

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int[][] resMatrix = new int[a.length][b.length];
        for(int i = 0; i < resMatrix.length; ++i){
            for(int j = 0; j < resMatrix.length; ++j){

                for(int k = 0; k < a.length; ++k){
                    resMatrix[i][j] += a[i][k] * b[k][j];
                }
            }

        }
        return resMatrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(matrixMultiplication(new int[][]{{1, 2}, {3, 4}}, new int[][]{{2, 1}, {1, 1}})));
    }

}