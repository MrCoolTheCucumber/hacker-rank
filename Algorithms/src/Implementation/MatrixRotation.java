package Implementation;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class MatrixRotation {

    public static void main(String... args) {
        Scanner sc = new Scanner(in);

        int m = sc.nextInt(); // cols
        int n = sc.nextInt(); // rows
        int r = sc.nextInt(); // no. of rotations anti-clockwise

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Point[][] points = new Point[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                points[i][j] = new Point(i, j);
            }
        }

        rotateMatrix(matrix, r, points);

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

    public static void rotateMatrix(int[][] matrix, int r, Point[][] points) {
        int[][] map = deepCopy(matrix);

        ArrayList<ArrayList<Pair<Point, Point>>> rings = getRings(new ArrayList<>(), points);

        for (ArrayList<Pair<Point, Point>> ring : rings) {

            for (int i = 0; i < ring.size(); i++) {
                Point p = ring.get(i).getK();

                ring.get((i + r) % ring.size()).setV(p);
            }
        }

        for (ArrayList<Pair<Point, Point>> ring : rings) {
            for (Pair<Point, Point> pair : ring) {
                matrix[pair.getK().x][pair.getK().y] = map[pair.getV().x][pair.getV().y];
            }
        }
    }

    public static ArrayList<ArrayList<Pair<Point, Point>>> getRings(
            ArrayList<ArrayList<Pair<Point, Point>>> rings, Point[][] points) {

        ArrayList<Pair<Point, Point>> ring = new ArrayList<>();

        int i = 0;
        //down
        for (i = 0; i < points.length; ++i) {
            ring.add(new Pair<>(points[i][0], null)); // ?
        }
        //right - skip outer corners
        for (i = 1; i < points[points.length - 1].length - 1; ++i) {
            ring.add(new Pair<>(points[points.length - 1][i], null));
        }
        //up
        for (i = points.length - 1; i >= 0; --i) {
            ring.add(new Pair<>(points[i][points[i].length - 1], null));
        }
        //left - skip outer corners
        for (i = points[0].length - 2; i > 0; --i) {
            ring.add(new Pair<>(points[0][i], null));
        }

        rings.add(ring);

        if (points.length == 2 || points[0].length == 2) {
            return rings;
        } else {
            return getRings(rings, removeOuterRing(points));
        }
    }

    public static Point[][] removeOuterRing(Point[][] points) {
        Point[][] trimmedMatrix = new Point[points.length - 2][points[0].length - 2];

        for (int i = 0; i < points.length - 2; ++i) {
            System.arraycopy(points[i + 1], 1, trimmedMatrix[i], 0, points[0].length - 2);
        }

        return trimmedMatrix;
    }

    public static class Pair<K, V> {

        private final K element0;
        private V element1;

        public Pair(K k, V v) {
            this.element0 = k;
            this.element1 = v;
        }

        public K getK() {
            return element0;
        }

        public void setV(V v) {
            this.element1 = v;
        }

        public V getV() {
            return element1;
        }

    }

    public static int[][] deepCopy(int[][] original) {
        if (original == null) {
            return null;
        }

        final int[][] result = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }
}
