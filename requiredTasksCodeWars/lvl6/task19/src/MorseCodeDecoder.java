//https://www.codewars.com/kata/54b724efac3d5402db00065e


public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        int spaceCount = 0;
        StringBuilder sentence = new StringBuilder();
        for(String s: morseCode.split(" ")){
            if(s.equals(" ")){
                spaceCount++;
                if(spaceCount == 3){
                    sentence.append(s);
                    spaceCount = 0;
                }
                continue;
            }
            sentence.append(MorseCode.get(s.trim())); //function MorseCode used on CodeWars
        }

        return sentence.toString().replaceAll("nullnull", " ").replaceAll("null", "").trim();
    }
}