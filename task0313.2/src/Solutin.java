public class Solutin {
    public static void main(String[] s){
        String[] st = {"Мама", "Мыла", "Раму"};
        for(int i = 0; i < 3; ++i){
            print(st[0] + st[1] + st[2]);
            print(st[0] + st[2] + st[1]);
            String m1 = st[0], m2 = st[1];
            st[0] = st[2]; st[1] = m1; st[2] = m2;
        }
    }
    public static void print(String s){
        System.out.println(s);
    }
}
