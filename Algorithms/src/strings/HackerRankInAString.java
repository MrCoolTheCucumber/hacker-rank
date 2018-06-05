package strings;

import java.util.Scanner;

public class HackerRankInAString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            char[] string = s.toCharArray();
            char[] hackerrank = "hackerrank".toCharArray();
            int hackerrankIndex = 0;

            boolean found = false;

            for (char c : string) {
                if(c == hackerrank[hackerrankIndex]) {
                    hackerrankIndex++;
                    if(hackerrankIndex == 9) {
                        found = true;
                        break;
                    }
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}
