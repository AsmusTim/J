public class Mouse extends Animal{
    private double lenTail;
    private double growth;

    public Mouse(){
        this.lenTail = 12;
        this.growth = 0.01;
    }
    public Mouse(String name){
        this.name = name;
        this.lenTail = 12;
        this.growth = 0.01;
    }
    public Mouse(String name, int age){
        this.name = name;
        this.age = age;
        this.lenTail = 12;
        this.growth = 0.01;
    }
    public Mouse(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        this.lenTail = 12;
        this.growth = 0.01;
    }
    public Mouse(String name, double len, double growth){
        this.name = name;
        this.lenTail = len;
        this.growth = growth;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    public void setLenTail(int lenTail) {
        this.lenTail = lenTail;
    }

    public double getGrowth() {
        return growth;
    }

    public double getLenTail() {
        return lenTail;
    }
}
