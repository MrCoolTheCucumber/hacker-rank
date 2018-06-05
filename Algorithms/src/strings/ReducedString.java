package strings;

import java.util.Scanner;

public class ReducedString {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        char[] string = in.next().toCharArray();

        boolean reScan;

        do {
            reScan = false;

            for (int i = 0; i < string.length - 1; i++) {
                if(string[i] == string[i + 1]) {
                    string = rebuildCharArray(string, i);
                    reScan = true;
                    break;
                }
            }

        } while (reScan);

        if(string.length == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(new String(string));
        }

    }

    public static char[] rebuildCharArray(char[] string, int i) {
        char[] charArray = new char[string.length - 2];

        if(i == 0) {
            System.arraycopy(string, 2, charArray, 0, string.length - 2);
        } else {
            System.arraycopy(string, 0, charArray, 0, i);
            System.arraycopy(string, i + 2, charArray, i, string.length - i - 2);
        }


        return charArray;
    }
}
