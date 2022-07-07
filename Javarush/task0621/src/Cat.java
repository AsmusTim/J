import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cat {
    private String name;
    private Cat parentMother;
    private Cat patentFather;

    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, Cat parentMother, Cat patentFather){
        this.name = name;
        this.parentMother = parentMother;
        this.patentFather = patentFather;
    }

    @Override
    public String toString(){
        if(this.patentFather == null && this.parentMother == null){
            return "Cat name is " + this.name + ", no mother, no father";
        }
        else if(this.parentMother == null){
            return "Cat name is " + this.name + ", father is " + this.patentFather + ", no mother";
        }
        else if (this.patentFather == null){
            return "Cat name is " + this.name + ", no father, mother is " + this.parentMother;
        }
        return "Cat name is " + this.name + ", father is ," + this.patentFather + "mother is " + this.parentMother;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat catGrandpa = new Cat(reader.readLine());
        Cat catGrandma = new Cat(reader.readLine());
        Cat catFather = new Cat(reader.readLine(), null, catGrandpa);
        Cat catMother = new Cat(reader.readLine(), catGrandma, null);
        Cat catSon = new Cat(reader.readLine(), catMother, catFather);
        Cat catDaughter = new Cat(reader.readLine(), catMother, catFather);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

}
