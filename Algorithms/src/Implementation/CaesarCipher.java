package Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();

        System.out.println(encrypt(s, k));
        // A = 65, Z = 90
        //a = 97, z = 122
    }

    public static String encrypt(String s, int k) {
        char[] charArr = s.toCharArray();
        ArrayList<Integer> text = new ArrayList<>();

        for (char c : charArr) {
            int ch = (int)c;
            if(ch >= 65 && ch <= 90) {
                //capital

                int temp = ch - 65;
                temp = ((temp + k) % 26);
                temp += 65;

                text.add(temp);

            } else if(ch >= 97 && ch <= 122) {
                //lowercase
                int temp = ch - 97;
                temp = ((temp + k) % 26);
                temp += 97;

                text.add(temp);
            } else {
                text.add((int)c);
            }
        }

        StringBuilder sb = new StringBuilder();

        text.stream().forEach(c -> {
            int temp = c;
            sb.append((char)temp);
        });

        return sb.toString();
    }
}
