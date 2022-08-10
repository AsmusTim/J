import java.awt.*;
import java.util.ArrayList;

public class Human {

    int age;
    String name;
    char sex;

    public Human(int age, String name, char sex){
        this.age = age;
        this.name = name;
        this.sex = Character.toUpperCase(sex);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    public static ArrayList<Human> getHumansList(){
        int size = (int) (Math.random() * 50 + 1);
        ArrayList<Human> list = new ArrayList<>();

        for(int i = 0; i < size; ++i){
            int age = (int)(Math.random() * 35 + 15);
            list.add( new Human(age, "name" + i, Math.random() < 0.5 ? 'F' : 'M'));
        }
        return list;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
