//https://www.codewars.com/kata/5259510fc76e59579e0009d4

public class Dictionary {

    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public static int[] consilience(String lessS, String moreS){
        int consilience = 0, lenConsilience = 0, maxLenConsilience = 0;
        int shift = 0;
        for(int i = 0; i < lessS.length(); ++i){
            for(int j = shift; j < moreS.length(); ++j){
                if(moreS.charAt(j) == lessS.charAt(i)) {
                    consilience++;
                    shift = j + 1;
                    lenConsilience++;
                    break;
                }
                else{
                    maxLenConsilience = Math.max(maxLenConsilience, lenConsilience);
                    lenConsilience = 0;
                }
            }
        }

        return new int[]{consilience, maxLenConsilience};
    }


    public String findMostSimilar(String to) {
        String possiblyWord = words[0];
        int consilience = 0, seriesConsilience = 0;
        for(String s: words){
            int[] count; // keep count of consilience and number of max series consilience char in word
            if(s.length() > to.length()){ // number line must be less count column
                count = consilience(to, s);
            }
            else{
                count = consilience(s, to);
            }


            int lenPossiblyWord = possiblyWord.length(), lenTo = to.length(), lenS = s.length();
            if(count[0] > consilience){
                if(Math.abs(lenPossiblyWord - lenTo) >= Math.abs(lenS - lenTo)){
                    possiblyWord = s;
                    consilience = count[0];
                    seriesConsilience = count[1];
                }
            }
            else if(count[0] == consilience){
                if(Math.abs(lenPossiblyWord - lenTo) >= Math.abs(lenS - lenTo)){
                    if(count[1] >= seriesConsilience){
                        possiblyWord = s;
                        seriesConsilience = count[1];
                    }
                }

            }
        }
        return possiblyWord;
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
        System.out.println(dictionary.findMostSimilar("strawbery") + " : strawberry");
        System.out.println(dictionary.findMostSimilar("berry") + " : cherry");

        dictionary = new Dictionary(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
        System.out.println(dictionary.findMostSimilar("heaven") + " : java");
        System.out.println(dictionary.findMostSimilar("javascript") + " : javascript");

        dictionary = new Dictionary(new String[]{"pdyjrkaylryr", "cpnqknjyviusknmte", "zqdrhpviqslik"});
        System.out.println(dictionary.findMostSimilar("rkacypviuburk") + " : zqdrhpviqslik");
    }
}