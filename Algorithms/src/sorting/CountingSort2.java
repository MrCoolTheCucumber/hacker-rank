package sorting;

import java.util.Scanner;

public class CountingSort2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] counts = new int[100];

        for(int i = 0; i < n; ++i) {
            counts[in.nextInt()] += 1;
        }

        for(int i = 0; i < 100; ++i) {
            for (int j = 0; j < counts[i]; ++j) {
                System.out.print(i + " ");
            }
        }
    }
}
