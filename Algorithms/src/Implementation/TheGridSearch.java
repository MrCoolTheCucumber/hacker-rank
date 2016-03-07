package Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class TheGridSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            int[][] grid = new int[R][C];
            for (int G_i = 0; G_i < G.length; G_i++) {
                G[G_i] = in.next();
                char[] charArr = G[G_i].toCharArray();
                for (int g_i = 0; g_i < charArr.length; g_i++) {
                    grid[G_i][g_i] = (int)charArr[g_i] - 48;
                }
            }

            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            int[][] scan = new int[r][c];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
                char[] charArr = P[P_i].toCharArray();
                for (int p_i = 0; p_i < charArr.length; p_i++) {
                    scan[P_i][p_i] = (int)charArr[p_i] - 48;
                }
            }

            if(arrayScan(grid, scan)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean arrayScan(int[][] grid, int[][] p) {
        int[][] fragment = new int[p.length][p[0].length];

        for(int i = 0; i + p.length - 1 < grid.length; ++i) {
            for(int j = 0; j + p[0].length - 1 < grid[0].length; ++j) {

                //copy fragment
                for(int k = 0; k < p.length; ++k) {
                    System.arraycopy(grid[i + k], j, fragment[k], 0, p[0].length);
                }

                if(Arrays.deepEquals(fragment, p)) {
                    return true;
                }

            }
        }

        return false;
    }

}
