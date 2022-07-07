public class Solution {
    public static void main(String[] args) {
        Cat bar = new Cat("Barsik", 2, 4);
        Cat mur = new Cat("Murzik", 3, 5);
        Cat gar = new Cat("Garfild", 3, 15);

        fightCat(bar, mur);
        fightCat(bar, gar);
        fightCat(mur, gar);

        Person person = new Person(){};
        person.initialize("Name", 3);

    }

    public static void fightCat(Cat c1, Cat c2){
        if(c1.fight(c2)){System.out.println(c1.getName() + " win " + c2.getName());}
        else{System.out.println(c2.getName() + " win " + c1.getName());}
    }
}
