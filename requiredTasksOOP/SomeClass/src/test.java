import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        SomeClass<Integer> sc = new SomeClass<>();
        sc.add(0);
        sc.add(1);
        sc.add(2);
        sc.add(3);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        al.add(2);
        al.add(3);
        sc.addAll(1, al);
        //System.out.println(sc.size());

        for (int integer : sc) {
            System.out.println(integer);
        }
        int a = sc.get(0) + sc.get(1) + sc.get(5);
        System.out.println(a);
    }
}
