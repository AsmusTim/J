package Animal;

public class Animal {
    protected String name;
    protected int age;
    protected String address;

    public static String  cName = "cName", dName = "dName";

    public Animal(){
        this.name = "Name";
        this.age = 2;
        this.address = "None";
    }

    public Animal(String name){
        this.name = name;
        this.age = 2;
        this.address = "None";
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        this.address = "None";
    }

    public Animal(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.print("Object is die");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
