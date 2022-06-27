import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void bubbleTest1() {
        int[] arr1 = {-1, 1, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 1, -1};
        Solution.bubble(arr1);
        assertTrue(Arrays.equals(arr2, arr1));
    }
    @Test
    public void bubbleTest2() {
        int[] arr1 = {2, 5, 7, 1, 9};
        int[] arr2 = {9, 7, 5, 2, 1};
        Solution.bubble(arr1);
        assertTrue(Arrays.equals(arr2, arr1));
    }
    @Test
    public void bubbleTest3() {
        int[] arr1 = {1, 1, 1, 1};
        int[] arr2 = {1, 1, 1 ,1};
        Solution.bubble(arr1);
        assertTrue(Arrays.equals(arr2, arr1));
    }
    @Test
    public void bubbleTest4() {
        int[] arr1 = {-1, -5, -2, 1, -6};
        int[] arr2 = {1, -1, -2, -5, -6};
        Solution.bubble(arr1);
        assertTrue(Arrays.equals(arr2, arr1));
    }
    @Test
    public void bubbleTest5() {
        int[] arr1 = {3, 2, 5, 3, 2};
        int[] arr2 = {5, 3, 3, 2, 2};
        Solution.bubble(arr1);
        assertTrue(Arrays.equals(arr2, arr1));
    }
}