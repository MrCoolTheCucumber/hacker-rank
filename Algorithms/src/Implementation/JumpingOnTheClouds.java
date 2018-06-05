package Implementation;

import java.util.Scanner;

public class JumpingOnTheClouds {


    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        int index = 0;
        int numOfJumps = -1;
        while (index < a.length) {

            if(index + 2 >= a.length || a[index + 2] == 1) {
                index += 1;
            } else {
                index += 2;
            }

            ++numOfJumps;
        }

        System.out.println(numOfJumps);

    }

}
