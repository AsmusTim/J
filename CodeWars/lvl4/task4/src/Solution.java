//https://www.codewars.com/kata/51ba717bb08c1cd60f00002f

import java.util.ArrayList;

class Solution {
    public static String rangeExtraction(int[] arr) {
        int left = arr[0], right = arr[0];
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] == right + 1) {
                right = arr[i];
            } else {
                if (left == right) {
                    list.add("" + left);
                } else {
                    String s = left + "" + (Math.abs(left - right) > 1 ? "-" : ",") + "" + right;
                    list.add(s);
                }
                left = arr[i];
                right = left;
            }
        }
        if(left == right){ list.add("" + left); }
        else{
            String s = left + "" + (Math.abs(left - right) > 1 ? "-" : ",") + "" + right;
            list.add(s);
        }
        return String.join(",", list.toArray(new String[0]));
    }


    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));


    }
}