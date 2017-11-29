package Implementation;

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        int numOfPairs = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int sock : ar) {
            if(!map.containsKey(sock)) {
                map.put(sock, false);
                continue;
            }

            boolean currentBool = map.get(sock);
            if(!currentBool) {
                numOfPairs += 1;
            }
            map.put(sock, !currentBool);
        }

        return numOfPairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

}
