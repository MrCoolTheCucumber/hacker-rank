package datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);

        while(m-->0) {
            String operation = in.next();
            int firstArg = in.nextInt();
            int secondArg = in.nextInt();

            switch (operation) {
                case "AND":
                    if(firstArg == 1) {
                        bitSet1.and(bitSet2);
                    } else {
                        bitSet2.and(bitSet1);
                    }
                    break;
                case "OR":
                    if(firstArg == 1) {
                        bitSet1.or(bitSet2);
                    } else {
                        bitSet2.or(bitSet1);
                    }
                    break;
                case "XOR":
                    if(firstArg == 1) {
                        bitSet1.xor(bitSet2);
                    } else {
                        bitSet2.xor(bitSet1);
                    }
                    break;
                case "FLIP":
                    if(firstArg == 1) {
                        bitSet1.flip(secondArg);
                    } else {
                        bitSet2.flip(secondArg);
                    }
                    break;
                case "SET":
                    if(firstArg == 1) {
                        bitSet1.set(secondArg);
                    } else {
                        bitSet2.set(secondArg);
                    }
                    break;
            }

            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
    }

}
