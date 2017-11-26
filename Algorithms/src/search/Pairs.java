package search;

import java.util.*;

public class Pairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        HashSet<Integer> set = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            set.add(in.nextInt());
        }

        final int[] numOfPairs = {0};

        set.forEach(integer -> {
            if(set.contains(integer + k)) {
                numOfPairs[0] += 1;
            }
        });

        System.out.println(numOfPairs[0]);
    }
}
