import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sort() {
        int[] arr1 = {6, 3, 1 ,5, 2, 4};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        Solution.sort(arr1);

        assertTrue(Arrays.equals(arr2, arr1));
    }
}