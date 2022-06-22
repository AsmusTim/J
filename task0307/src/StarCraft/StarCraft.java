package StarCraft;

public class StarCraft {
    public static class Zegar {
        public String name;

        public Zegar(String n) {
            this.name = n;
        }
    }
    public static class Protos{
        public String name;
        public Protos(String n){
            this.name = n;
        }
    }
    public static class Terr{
        public String name;
        public Terr(String n){
            this.name = n;
        }
    }

    public static Zegar[] Zarr = new Zegar[10];
    public static Protos[] Parr = new Protos[5];
    public static Terr[] Tarr = new Terr[12];

    public static void main(String[] str){
        for(int i = 0; i < 10; ++i){
            Zarr[i] = new Zegar("z" + i);
        }
        for(int i = 0; i < 5; ++i){
            Parr[i] = new Protos("p" + i);
        }
        for(int i = 0; i < 12; ++i){
            Tarr[i] = new Terr("t" +  i);
        }
        System.out.println(Zarr[0].name);
    }
}
