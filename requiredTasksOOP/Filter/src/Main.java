import java.util.Arrays;

public class Main{

    public static Object[] filter(Object[] array, Filter filter){
        int offset = 0;
        for(int i = 0; i < array.length; ++i){
            if(filter.apply(array[i])){
                array[i - offset] = array[i];
            }
            else {offset++;}
        }
        return Arrays.copyOf(array, array.length - offset);

    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6 ,7 ,8, 9, 10};
        System.out.println(Arrays.toString( filter(arr, new Filter() {
            @Override
            public boolean apply(Object o) {
                return (int) o % 2 == 0;
            }
        })));
    }

}
