import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static List<String> addresses;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        addresses = new ArrayList<>();
        while (true) {
            String family = sc.nextLine();
            if (family.isEmpty()) break;

            String city = sc.nextLine();

            addresses.add(family);
            addresses.add(city);
        }

        String cityOfLiving = sc.nextLine();
        for (int i = 1; i < addresses.size(); i += 2) {
            if (addresses.get(i).equals(cityOfLiving)) {
                System.out.println(addresses.get(i - 1));
            }
        }
    }

    public static String getFamily(String cityOfLiving){
        for (int i = 1; i < addresses.size(); i += 2) {
            if (addresses.get(i).equals(cityOfLiving)) {
                return addresses.get(i - 1);
            }
        }
        return "";
    }
}