package strings;

import java.util.Scanner;

public class MakingAnagrams {

    static int makingAnagrams(String s1, String s2){
        int s1oc[] = new int[26];
        int s2oc[] = new int[26];

        for (char c : s1.toCharArray()) {
            s1oc[c - 97] += 1;
        }

        for (char c : s2.toCharArray()) {
            s2oc[c - 97] += 1;
        }

        int numOfDels = 0;
        for(int i = 0; i < 26; ++i) {
            int dif = Math.abs(s1oc[i] - s2oc[i]);
            if(dif != 0) {
                numOfDels += dif;
            }
        }

        return numOfDels;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }

}
