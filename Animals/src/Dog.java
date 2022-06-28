public class Dog {
    private String name;
    private int age;
    private float growth;
    private String color;
    public Dog(){}
    public Dog(String n){
        this.name = n;
    }
    public Dog(String n, int a){
        this.name = n;
        this.age = a;
    }
    public Dog(String n, float a){
        this.name = n;
        this.growth = a;
    }
    public Dog(String n, float a, String color){
        this.name = n;
        this.growth = a;
        this.color = color;
    }

    public void initialize(String name){
        this.name = name;
        this.age = 2;
        this.growth = 1;
        this.color = "Brown";
    }
    public void initialize(String name, float growth){
        this.name = name;
        this.age = 2;
        this.growth = growth;
        this.color = "Brown";
    }
    public void initialize(String name, float growth, String color){
        this.name = name;
        this.age = 2;
        this.growth = growth;
        this.color = color;
    }

    public void setAge(int age) { this.age = age; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public String getName() { return name; }

    public String getColor() {
        return color;
    }

    public float getGrowth() {
        return growth;
    }
}
