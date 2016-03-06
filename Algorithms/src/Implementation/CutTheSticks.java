package Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < nums.length; ++i) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        do {
            int i = nums[0];
            int cut = 0;

            boolean flag = false;
            int index = -1;

            for (int j = 0; j < nums.length; ++j) {
                nums[j] -= i;
                if(nums[j] <= 0) {
                    ++cut;
                } else {
                    if(!flag){
                        flag = true;
                        index = j;
                    }
                }
            }

            System.out.println(nums.length);

            if(index == -1) {
                break;
            }

            int[] newArr = new int[nums.length - cut];

            System.arraycopy(nums, index, newArr, 0, nums.length - cut);

            nums = newArr;

        } while (isArrayHasSticks(nums));

    }

    public static boolean isArrayHasSticks(int[] arr) {
        for (int i : arr) {
            if(i > 0) {
                return true;
            }
        }
        return false;
    }
}
