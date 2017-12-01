package sorting;

import java.util.Scanner;

public class CountingSort1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] counts = new int[100];

        for(int i = 0; i < n; ++i) {
            counts[in.nextInt()] += 1;
        }

        for (int count : counts) {
            System.out.print(count + " ");
        }
    }

}
