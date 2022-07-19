public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        int iter = 0, p1Iter = 0, p2Iter = 0;
        for(;;) {
            if (p1Iter < part1.length() && s.substring(iter, iter + 1).equals(part1.substring(p1Iter, p1Iter + 1))) {
                for (int i = 1; p1Iter + i < part1.length() + 1; ++i) {
                    if (!s.substring(iter, iter + i).equals(part1.substring(p1Iter, p1Iter + i))) {
                        p1Iter += i;
                        iter += i;
                        break;
                    }
                    System.out.println(s.substring(iter, iter + i) + "\n" + part1.substring(p1Iter, p1Iter + i));
                }
            } else if (p2Iter != part2.length() && s.substring(iter, iter + 1).equals(part2.substring(p2Iter, p2Iter + 1))) {
                for (int i = 1; p2Iter + i < part2.length() + 1; ++i) {
                    if (!s.substring(iter, iter + i).equals(part2.substring(p2Iter, p2Iter + i))) {
                        p2Iter += i - 1;
                        iter += i - 1;
                        break;
                    }
                    System.out.println(s.substring(iter, iter + i) + "\n" + part1.substring(p2Iter, p2Iter + i));
                }
            }
            else return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isMerge("codewars",
                "code",
                "wars"));
    }

}