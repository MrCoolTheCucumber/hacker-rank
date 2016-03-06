package strings;

import java.util.Scanner;

public class Pangrams {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine().toLowerCase();

        if(isPangram(string)) {
            System.out.println("pangram");
        }  else {
            System.out.println("not pangram");
        }

    }

    public static boolean isPangram(String s) {
        int[] alphabet = new int[123]; //97 to 122 a to z

        for (char c : s.toCharArray()) {
            alphabet[(int)c] = 1;
        }

        for(int i = 97; i < 123; ++i) {
            if(alphabet[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
