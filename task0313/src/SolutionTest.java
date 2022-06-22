import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testReverse1(){
        int[] arr = {1, 2, 5, 4, 3};
        int[] arr1 = {1, 2, 3, 4, 5};
        Solution.reverse(arr1, 2, 4);
        assertTrue(Arrays.equals(arr, arr1));
    }
    @Test
    void testReverse2(){
        int[] arr = {1, 2, 3, 6, 5, 4, 7 ,8};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Solution.reverse(arr1, 3, 5);
        assertTrue(Arrays.equals(arr, arr1));
    }
    @Test
    void testReverse3(){
        int[] arr = {1, 2, 5, 4, 3};
        int[] arr1 = {1, 2, 3, 4, 5};
        Solution.reverse(arr1, 0, 4);
        assertTrue(Arrays.equals(arr, arr1));
    }

    @Test
    void narayama() {
    }
}