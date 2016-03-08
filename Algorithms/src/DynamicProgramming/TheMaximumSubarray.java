package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class TheMaximumSubarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        while (T-- > 0) {
            int n = in.nextInt();
            int[] array = new int[n];

            boolean hasPositive = false;
            for (int i = 0; i < n; ++i) {
                array[i] = in.nextInt();
                if (array[i] >= 0) {
                    hasPositive = true;
                }
            }

            solve(array, hasPositive);
        }

    }

    public static void solve(int[] array, boolean hasPositive) {
        int nonCont = 0;
        int cont;

        if (!hasPositive) {
            int min = Integer.MIN_VALUE;
            for (int i : array) {
                if (i > min) {
                    min = i;
                }
            }
            System.out.println(min + " " + min);
            return;
        }

        //sum positive ints
        for (int i : array) {
            if(i > 0) {
                nonCont += i;
            }
        }

        int sum = Integer.MIN_VALUE;
        //search sub arrays
        //TODO optimise to O(n) due to timeout
        for(int i = 0; i < array.length; ++i) {
            for(int j = i; j < array.length; ++j) {

                int s = sumArray(Arrays.copyOfRange(array, i, j+1));

                if(s > sum) {
                    sum = s;
                }
            }
        }

        cont = sum;

        System.out.println(cont + " " + nonCont);
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        return sum;
    }

}
