package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        int[] counters = new int[5];
        for(int i = 0; i < ar.length; ++i) {
            counters[ar[i] - 1] += 1;
        }

        int commonType = 0;
        for(int i = 0; i < counters.length; ++i) {
            if(counters[i] > counters[commonType]) {
                commonType = i;
            }
        }

        return commonType + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}