import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static Set<Animal> pets = new HashSet<>();
    public static interface Animal{}
    public static class Cat implements Animal{
        public static Set<Cat> catSet = new HashSet<>();
        public String name;

        Cat(){this.name = "Murzik";}
        Cat(String name){
            this.name = name;
        }

        public static void createCat(){
            for(int i = 0; i < 3; ++i){
                Cat.catSet.add(new Cat());
            }
        }

        @Override
        public String toString(){ return this.name; }

        public static void printCats(){
            for(Cat i: Cat.catSet){ System.out.println(i); }
        }
    }

    public static class Dog implements Animal{
        public static Set<Dog> dogSet = new HashSet<>();
        public String name;

        Dog(){this.name = "Murzik";}
        Dog(String name){
            this.name = name;
        }

        public static void createDogs(){
            for(int i = 0; i < 3; ++i){
                Dog.dogSet.add(new Dog());
            }
        }

        @Override
        public String toString(){ return this.name; }

        public static void printDogs(){
            for(Dog i: Dog.dogSet){ System.out.println(i); }
        }
    }

    public static void join(){
        pets.addAll(Cat.catSet);
        pets.addAll(Dog.dogSet);
    }

    public static void removeCats(){
        ArrayList<Cat> catsForDel = new ArrayList<>();
        for(Animal i: pets){
            if(i instanceof Cat){ catsForDel.add((Cat) i); }
        }
        for(Cat c: catsForDel){
            pets.remove(c);
        }
    }
}
