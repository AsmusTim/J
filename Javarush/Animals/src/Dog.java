public class Dog extends Animal{
    private float growth;
    private String color;
    public Dog(){}
    public Dog(String n){
        this.name = n;
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dog(String name, float growth){
        this.name = name;
        this.growth = growth;
    }
    public Dog(String name, float growth, String color){
        this.name = name;
        this.growth = growth;
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

    public String getColor() {
        return color;
    }

    public float getGrowth() {
        return growth;
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
