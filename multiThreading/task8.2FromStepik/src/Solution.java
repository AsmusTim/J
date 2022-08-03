import java.util.Arrays;
import java.util.concurrent.*;

public class Solution {

    public static final int sizeArr = 10_000_002;

    public static float func(float a, int i){
        return (float) (a * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }

    public static float[] initArr(){
        float[] arr = new float[sizeArr];
        Arrays.fill(arr, 1);
        return arr;
    }

    public static void withoutConcurrency(){
        float[] arr = initArr();
        long before = System.currentTimeMillis();
        for(int i = 0; i < arr.length; ++i){
            arr[i] = func(arr[i], i);
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);

    }

    public static void withConcurrency(){
        float[] arr = initArr();
        long before = System.currentTimeMillis();

        float[] leftHalf = new float[sizeArr/2];
        float[] rightHalf = new float[sizeArr/2];
        System.arraycopy(arr, 0, leftHalf, 0, sizeArr/2);
        System.arraycopy(arr, sizeArr/2, rightHalf, 0, sizeArr/2);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < leftHalf.length; ++i){
                    leftHalf[i] = func(leftHalf[i], i);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < rightHalf.length; ++i){
                    rightHalf[i] = func(rightHalf[i], i);
                }
            }
        }).start();

        System.arraycopy(leftHalf, 0, arr, 0, leftHalf.length);
        System.arraycopy(rightHalf, 0, arr, sizeArr/2, rightHalf.length);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    public static void main(String[] args) {

        withoutConcurrency();
        withConcurrency();
    }

}
