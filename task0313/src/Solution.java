public class Solution {
    public static void main(String[] str){
        int[] arr = {0, 1, 2};
        String[] st = {"Мама", "Мыла", "Раму"};

        System.out.println(st[arr[0]] + st[arr[1]] + st[arr[2]]);
        for(int i = 0; i < 5; ++i){
            Narayama(arr);
            System.out.println(st[arr[0]] + st[arr[1]] + st[arr[2]]);
        }

    }

    public static void reverse(int[] arr, int begin, int end){
        int mid;
        for(int i = 0; i < (end - begin) + 1; ++i){
            mid = arr[begin];
            arr[begin] = arr[end];
            arr[end] = mid;
            begin++;
            end--;
        }
    }


    public static void Narayama(int[] arr){
        int index = -1;
        for(int i = arr.length - 1; i > 0; --i){
            if(arr[i - 1] < arr[i]){
                index = i - 1;
                break;
            }
        }

        for(int i = arr.length - 1; i > index; --i){
            if(arr[i] > arr[index]){
                int mid = arr[i];
                arr[i] = arr[index];
                arr[index] = mid;
                reverse(arr, index + 1, arr.length - 1);
                break;
            }
        }
    }
}
