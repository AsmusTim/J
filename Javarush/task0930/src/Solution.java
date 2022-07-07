import java.util.*;

public class Solution {
    public static ArrayList list;

    public static void main(String[] args) {
        list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.nextLine();
            try {
                int a = Integer.parseInt(s);
                list.add(a);
            }
            catch (NumberFormatException e){
                if(s.equals("")) break;
                list.add(s);
            }
        }

        printTask(list);
    }

    public static void printTask(ArrayList list){

        ArrayList listIndexString = new ArrayList<>();
        ArrayList listIndexInt = new ArrayList<>();

        for(int i = 0; i < list.size(); ++i){
            if(list.get(i) instanceof String){
                listIndexString.add(i);
                listIndexString.add(list.get(i));
            }
            else{
                listIndexInt.add(i);
                listIndexInt.add(list.get(i));
            }
        }

        for(int i = 0; i < listIndexString.size() / 2; ++i){
            for(int j = 3; j < listIndexString.size(); j += 2){
                if(listIndexString.get(j).toString().charAt(0) < listIndexString.get(j - 2).toString().charAt(0)){
                    String mid = listIndexString.get(j).toString();
                    listIndexString.set(j, listIndexString.get(j - 2).toString());
                    listIndexString.set(j - 2, mid);
                }
            }
        }
        for(int i = 0; i < listIndexInt.size() / 2; ++i){
            for(int j = 3; j < listIndexInt.size(); j += 2){
                int left = (int) listIndexInt.get(j);
                int right = (int) listIndexInt.get(j - 2);
                if(left > right){
                    int mid = left;
                    listIndexInt.set(j, right);
                    listIndexInt.set(j - 2, mid);
                }
            }
        }

        for(int i = 0; i < listIndexString.size(); i += 2){
            list.set((int) listIndexString.get(i), listIndexString.get(i + 1));
        }

        for(int i = 0; i < listIndexInt.size(); i += 2){
            list.set((int) listIndexInt.get(i), listIndexInt.get(i + 1));
        }

        for(int i = 0; i < list.size(); ++i){
            System.out.println(list.get(i));
        }
    }

}
