public class Solution {
    public static void main(String[] str){

    }
    static class Cat{
        private static int catsCount = 0;
        public static int count = 0;
        private String fullName;


        public Cat(){count++;}
        public static void setCatsCount(int catsCount) {
            Cat.catsCount = catsCount;
        }

        public static int getCatsCount(){ return Cat.catsCount;}
        public void setName(String firstName, String lastName) {
            String fullName = firstName + " " + lastName;
            this.fullName = fullName;
        }

        public String getName(){
            return this.fullName;
        }

    }
}

