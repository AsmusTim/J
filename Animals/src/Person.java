public class Person {
    protected String name;
    protected int age;
    protected String sex;
    protected String address;

    public Person(){}
    public Person(String n, int a, String s, String adr){
        this.name = n;
        this.age = a;
        s = s.trim();
        this.sex = (s.equals("M") || s.equals("F") || s.equals("m") || s.equals("f")) ? s: "None";
        this.address = adr.trim();
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.sex = "M";
        this.address = "None";
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setSex(String sex) {
        sex = sex.trim();
        this.sex = (sex.equals("M") || sex.equals("F") || sex.equals("m") || sex.equals("f")) ? sex: "None";
    }
    public void setAddress(String address) { this.address = address; }

    public int getAge() { return age; }
    public String getName() { return name; }
    public String getSex() { return sex; }
    public String getAddress() { return address; }
}
