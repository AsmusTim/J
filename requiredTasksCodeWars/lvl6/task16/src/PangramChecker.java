//https://www.codewars.com/kata/545cedaa9943f7fe7b000048

public class PangramChecker {
    public boolean check(String sentence){
        return 26 == (int) sentence.toLowerCase().replaceAll("[^a-z]", "").chars().distinct().count();
    }

    public static void main(String[] args) {
        System.out.println(new PangramChecker().check("l pcjqmv dzyxoppax mb gair tazcvf aufn skhwtfe!6698759"));
    }
}