public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends Exception{
        public MyException(){
            super("Exception");
        }
    }

    static class MyException2 extends Exception{
        public MyException2(){
            super("Exception");
        }
    }

    static class MyException3 extends RuntimeException{
        public MyException3(){
            super("RuntimeException");
        }
    }

    static class MyException4 extends RuntimeException{
        public MyException4(){
            super("RuntimeException");
        }
    }
}