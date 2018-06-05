package sorting;

import java.util.Scanner;

public class InsertionSortPart1 {

    public static int insertionSortPart2(int[] input) {
        int numOfShifts = 0;
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                    numOfShifts += 1;
                }
            }
        }

        return numOfShifts;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        System.out.println(insertionSortPart2(ar));
    }
}
