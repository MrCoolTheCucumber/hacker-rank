package Implementation;

import java.util.Scanner;

public class CavityMap {

    public static void print_array(int grid[][]) {

        for(int[] ints: grid) {
            for(int n: ints) {

                if(n == -1) {
                    System.out.print("X");
                } else {
                    System.out.print(n);
                }
            }
            System.out.println();
        }
    }


    public static void main(String... args) {
        int n;
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        int grid [][] = new int[n][n];
        int out [][] = new int[n][n];
        String G[] = new String[n];

        for (int G_i = 0; G_i < G.length; G_i++) {
            G[G_i] = in.next();
            char[] charArr = G[G_i].toCharArray();
            for (int g_i = 0; g_i < charArr.length; g_i++) {
                grid[G_i][g_i] = (int)charArr[g_i] - 48;
                out[G_i][g_i] = (int)charArr[g_i] - 48;
            }
        }

        if(n == 1 || n == 2) {
            print_array(out);
            return;
        }

        int k;
        for(int i = 1; i < n - 1; ++i) {
            for(int j = 1; j < n - 1; ++j) {
                k = grid[i][j];

                if       (grid[i-1][j] >= k) {
                    continue;
                } else if(grid[i+1][j] >= k) {
                    continue;
                } else if(grid[i][j-1] >= k) {
                    continue;
                } else if(grid[i][j+1] >= k) {
                    continue;
                }

                out[i][j] = -1;
            }
        }

        print_array(out);
    }
}
