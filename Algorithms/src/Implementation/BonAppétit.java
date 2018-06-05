package Implementation;

import java.util.Scanner;

public class BonAppétit {

    static void bonAppetit(int n, int k, int b, int[] ar) {
        double actualCost = 0;
        for (int i = 0; i < ar.length; i++) {
            if(i == k) {
                continue;
            }
            actualCost += ar[i];
        }
        actualCost /= 2.0;

        if( b != actualCost ){
            System.out.println((int)(b - actualCost));
        } else {
            System.out.println("Bon Appetit");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        bonAppetit(n, k, b, ar);
    }
}
