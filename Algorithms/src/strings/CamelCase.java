package strings;

import java.util.Scanner;

public class CamelCase {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        char[] charArr = in.next().toCharArray();

        int numOfUpperCaseChars = 0;

        for (char aCharArr : charArr) {
            if (Character.isUpperCase(aCharArr)) {
                numOfUpperCaseChars += 1;
            }
        }

        System.out.println(numOfUpperCaseChars + 1);
    }
}
