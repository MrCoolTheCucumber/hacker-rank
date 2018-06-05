package strings;

import java.util.Scanner;

public class FunnyString {

    static String funnyString(String s){
        char[] charS = s.toCharArray();

        boolean funny = true;

        char[] charR = new StringBuilder(s).reverse().toString().toCharArray();
        for(int i = 1; i < s.length(); ++i) {
            if(Math.abs(charS[i] - charS[i - 1]) != Math.abs(charR[i] - charR[i - 1])) {
                funny = false;
            }
        }


        return funny ? "Funny" : "Not Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }

}
