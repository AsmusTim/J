public class Solution {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("Barsik");
    }
    static class Cat{
        private String name;

        public void setName(String name) {
            this.name = name;
        }
        public void printName(){
            if(this.name == null) {System.out.print("Имени нет"); return;}
            System.out.print(this.name);
        }
    }
}