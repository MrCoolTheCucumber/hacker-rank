package search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MissingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] nArray = new int[n];
        for(int i = 0; i < n; ++i) {
            nArray[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] mArray = new int[m];
        for(int i = 0; i < m; ++i) {
            mArray[i] = in.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : mArray) {
            if(!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        for (int i : nArray) {
            map.put(i, map.get(i) - 1);
        }

        ArrayList<Integer> missing = new ArrayList<>();

        map.forEach((k, v) -> {
            if(v > 0) {
                missing.add(k);
            }
        });
        Collections.sort(missing);

        StringBuilder sb = new StringBuilder();
        missing.forEach(i -> sb.append(i).append(" "));
        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb.toString());
    }
}
