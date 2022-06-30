public class Human {

    private String name;
    private Human father;
    private Human mother;

    public Human(String name){
        this.name = name;
    }
    public Human(String name, Human father, Human mother){
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString(){
        if(this.father == null && this.mother == null) return "Name: " + this.name + ", no father, no mother";
        else if(this.father == null) return "Name: " + this.name + ", no father, mother " + this.mother;
        else if(this.mother == null) return "Name: " + this.name + ", father " + this.father + ", no mother";
        return "Name: " + this.name + ", father " + this.father + ", mother " + this.mother;
    }

    public static void main(String[] args) {
        Human grandPaF = new Human("a");
        Human grandMaF = new Human("b");
        Human grandPaM = new Human("c");
        Human grandMaM = new Human("d");
        Human father = new Human("e", grandPaF, grandMaF);
        Human mother = new Human("f", grandPaM, grandMaM);
        Human child1 = new Human("g", father, mother);
        Human child2 = new Human("h", father, mother);
        Human child3 = new Human("m", father, mother);

        Human[] h = {grandPaF, grandMaF, grandPaM, grandMaM, father, mother, child1, child2, child3};
        for(int i = 0; i < h.length; ++i){
            System.out.println(h[i]);
        }
    }
}
