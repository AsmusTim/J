//https://www.codewars.com/kata/5418a1dd6d8216e18a0012b2


public class Validate{
    public static boolean validate(String n){
        int start = n.length() % 2 == 0 ? 0 : 1;
        char[] arr = n.toCharArray();
        for(int i = start; i < n.length(); i += 2){
            int d = (arr[i] - '0') * 2;
            if(d / 10 != 0){
                d -= 9;
            }
            arr[i] = (char) (d + '0');
        }
        return new String(arr).chars().map(e -> e - '0').sum() % 10 == 0;
    }

    public static void main(String[] args) {
        System.out.println(validate("2121"));
    }
}