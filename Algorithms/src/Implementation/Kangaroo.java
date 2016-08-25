package Implementation;

import java.util.Scanner;

public class Kangaroo {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        System.out.println(calculate(x1, v1, x2, v2) ? "YES" : "NO");
    }

    public static boolean calculate(int x1, int v1, int x2, int v2) {
        if (v2 >= v1) {
            return false;
        }

        int x1Pos = x1;
        int x2Pos = x2;

        while (x1Pos < x2Pos) {
            x1Pos += v1;
            x2Pos += v2;

            if (x1Pos == x2Pos) {
                return true;
            }
        }

        return false;
    }
}
