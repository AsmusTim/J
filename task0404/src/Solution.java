public class Solution {


    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.print(c.getCatsCount());
    }
    static class Cat{
        private static int catsCount = 0;

        public Cat() {
            catsCount++;
        }
        public static int getCatsCount(){return catsCount;}
    }
}