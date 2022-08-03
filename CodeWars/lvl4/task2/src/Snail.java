//https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1


import java.util.*;

public class Snail {

    public static int[] snail(int[][] array) {
        if(array[0].length == 0) return new int[0];
        if(array.length == 1) return array[0];

        int[] res = new int[array.length * array.length];
        int i = 0, col = 0, row = 0, size = array.length * array.length;
        while(i < array.length * array.length){
            while(col < array.length && array[row][col] != -1){
                if(i == (array.length * array.length)) return res;
                res[i] = array[row][col];
                array[row][col] = -1;
                col++;
                i++;
            }
            col--;
            row++;
            while(row < array.length && array[row][col] != -1){
                if(i == (array.length * array.length)) return res;
                res[i] = array[row][col];
                array[row][col] = -1;
                row++;
                i++;
            }
            row--;
            col--;
            while(col > -1 && array[row][col] != -1){
                if(i == (array.length * array.length)) return res;
                res[i] = array[row][col];
                array[row][col] = -1;
                col--;
                i++;
            }
            col++;
            row--;
            while(array[row][col] != -1){
                if(i == (array.length * array.length)) return res;
                res[i] = array[row][col];
                array[row][col] = -1;
                row--;
                i++;
            }
            row++;
            col++;
        }
        return res;
    }


    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 1, 1, 1, 1}, {4, 5, 5, 5, 2}, {4, 8, 8, 6, 2}, {4, 7, 7, 6, 2}, {3, 3, 3, 3, 2}};

        a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //a = new int[][]{{1, 1}, {2, 2}};

        System.out.println(Arrays.toString(snail(a)));


        
    }
}