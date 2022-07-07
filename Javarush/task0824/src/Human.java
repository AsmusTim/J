import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Human {
    public String name;
    public boolean sex;
    public int age;
    public ArrayList<Human> child;

    Human(String name){
        this.name = name;
        this.child = new ArrayList<>();
    }
    Human(String name, Human[] child){
        this.name = name;
        this.child = new ArrayList<>(Arrays.asList(child));
    }

    @Override
    public String toString(){
        if(this.child.size() == 0){ return "Name is " + this.name;}
        else {
            String res = "Name is" + this.name;
            for(Human i: this.child){
                res += i.name + " ";
            }
            return res;
        }
    }
}
