import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testOnString(){
        String[] arr = {"a", "a", "a", "abc", "cbv"};
        String[] arrForCheck = {"abc", "cbv"};
        arr = (String[]) Main.filter(arr, new Filter() {
            @Override
            public boolean apply(Object o) {
                return !String.valueOf(o).equals("a");
            }
        });
        assertArrayEquals(arrForCheck, arr);
    }
}