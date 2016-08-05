package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while(n-->0) {
            list.add(in.nextInt());
        }

        int q = in.nextInt();

        while(q-->0) {
            if(in.next().equals("Insert")) {
                int index = in.nextInt();
                list.add(index, in.nextInt());
            } else {
                int index = in.nextInt();
                list.remove(index);
            }
        }

        list.forEach(integer -> {
            System.out.print(integer + " ");
        });
    }
}
