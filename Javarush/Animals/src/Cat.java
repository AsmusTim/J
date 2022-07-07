import java.util.ArrayList;

public class Cat extends Animal{
    private int weight;
    private int strength;
    private String color;

    private int id;
    public static int catCounter;
    public static ArrayList<Cat> catList = new ArrayList<>();

    public Cat(){
        Cat.catCounter++;
        this.id = Cat.catCounter;
        catList.add(this);
    }
    public Cat(String n, int a, int w){
        this.name = n;
        this.age = Math.max(a, 0);
        this.weight = w;
        this.strength = w * 2 - a;
        catCounter++;
        this.id = Cat.catCounter;
        catList.add(this);
    }
    public Cat(String name){
        this.name = name;
        this.age = 1;
        this.weight = 3;
        this.address = "None";
        this.color = "black";
        this.strength = 5;
        catCounter++;
        this.id = Cat.catCounter;
        catList.add(this);
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.address = "None";
        this.color = "black";
        this.strength = 6 - age;
        catCounter++;
        this.id = Cat.catCounter;
        catList.add(this);
    }
    public Cat(int weight, String color){
        this.name = "Cat";
        this.age = 1;
        this.weight = weight;
        this.address = "None";
        this.color = color;
        this.strength = weight * 2 -1;
        catCounter++;
        this.id = Cat.catCounter;
        catList.add(this);
    }
    public Cat(int weight, String color, String address){
        this.name = name;
        this.age = 1;
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.strength = weight * 2 -1;
        catCounter++;
        this.id = Cat.catCounter;
        catList.add(this);
    }

    @Override
    protected void finalize() throws Throwable {
        Cat.catCounter--;
    }


    public void initialize(String name){
        this.name = name;
        this.age = 1;
        this.weight = 3;
        this.address = "None";
        this.color = "black";
        this.strength = 5;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.address = "None";
        this.color = "black";
        this.strength = 6 - age;
    }
    public void initialize(int weight, String color){
        this.name = "Cat";
        this.age = 1;
        this.weight = weight;
        this.address = "None";
        this.color = color;
        this.strength = weight * 2 -1;
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = "None";
        this.color = "black";
        this.strength = weight * 2 -age;
    }
    public void initialize(int weight, String color, String address){
        this.name = name;
        this.age = 1;
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.strength = weight * 2 -1;
    }

    @Override
    public void setAge(int a){
        this.age = a;
        this.strength = this.weight * 2 - a;
    }
    public void setWeight(int w){
        this.weight = w;
        this.strength = w * 2 - this.age;
    }


    public int getWeight(){return this.weight;}
    public int getStrength(){return this.strength;}
    public boolean fight(Cat anotherCat){ return this.strength >= anotherCat.getStrength(); }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat";
    }

    public static void printCat(){
        for(Cat cat: Cat.catList){
            System.out.println(cat.getName());
        }
    }
}
