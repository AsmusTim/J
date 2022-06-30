public class Solution {

    public static void printIdea(Idea idea){
        System.out.print(idea.getDescription());
    }

    public static class Idea{
        public String getDescription(){
            return "Idea";
        }
    }
}
