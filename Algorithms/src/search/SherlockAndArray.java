package search;

import java.util.Scanner;

public class SherlockAndArray {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while(T-->0) {
            int n = in.nextInt();
            int[] array = new int[n];

            for(int i = 0; i < n; ++i) {
                array[i] = in.nextInt();
            }

            if(n == 1) {
                System.out.println("YES");
                continue;
            }
            if(n == 2) {
                System.out.println("NO");
                continue;
            }

            find(array);

        }
    }

    public static void find(int[] array) {

        int sumBefore = array[0];
        int sumAfter = 0;
        for(int i = 2; i < array.length; ++i) {
            sumAfter += array[i];
        }

        for(int i = 1; i < array.length - 1; ++i) {
            if(sumBefore == sumAfter) {
                System.out.println("YES");
                return;
            }

            sumBefore += array[i];
            sumAfter -= array[i + 1];
        }

        System.out.println("NO");
    }
}
