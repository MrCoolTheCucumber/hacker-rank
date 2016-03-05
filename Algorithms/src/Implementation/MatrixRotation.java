package Implementation;

import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;
import static java.lang.System.in;

public class MatrixRotation {

    public static void main(String... args) {
        Scanner sc = new Scanner(in);

        int m = sc.nextInt(); // cols
        int n = sc.nextInt(); // rows
        int r = sc.nextInt(); // no. of rotations anti-clockwise

        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotateMatrix(matrix, m, n);

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.print("\n");
        }
    }

    public static int getRotations(int m, int n, int r) {
        return r % (((m - 1) + (n - 1)) * 2);
    }

    public static void rotateMatrix(int[][] matrix, int m, int n) {
        int[][] map = matrix.clone();

        //get rings, and remap rings?

        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {

            }
        }
    }
}
