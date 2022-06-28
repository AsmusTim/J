public class Friend {
    private String name;
    private int age;
    private char sex;

    public Friend(){}
    public Friend(String name){
        this.name = name;
    }
    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Friend(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public void initialize(String n){
        this.name = n;
    }
    public void initialize(String n, int a){
        this.name = n;
        this.age = a;
    }
    public void initialize(String n, int a, char s){
        this.name = n;
        this.age = a;
        this.sex = s;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public char getSex() { return sex; }
}
