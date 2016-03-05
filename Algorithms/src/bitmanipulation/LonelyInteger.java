package bitmanipulation;

import java.util.Scanner;

public class LonelyInteger {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if(n == 1){
            System.out.println(in.nextInt());
            return;
        }

        int[] array = new int[n];

        for(int i = 0; i < n; ++i) {
            array[i] = in.nextInt();
        }

        int result = 0;

        for(int i: array) {
            result ^= i;
        }

        System.out.println(result);
    }
}
