package Implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int numOfPairs = 0;

        for(int j = 1; j < n; ++j) {
            for(int i = 0; i < j; ++i) {
                if((a[i] + a[j]) % k == 0) {
                    ++numOfPairs;
                }
            }
        }

        System.out.println(numOfPairs);
    }
}
