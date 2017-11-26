package graphtheory;

import java.util.*;

public class DijkstraShortestReach2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        //for each test case
        for(int a0 = 0; a0 < t; a0++){
            //n nodes
            int n = in.nextInt();
            //m edges
            int m = in.nextInt();

            int[][] adjMatrix = new int[n][n];

            //for each edge, x and y are the two nodes in the edge, r is the edge weight
            //edges are undirected
            for(int a1 = 0; a1 < m; a1++){
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                int r = in.nextInt();

                if(adjMatrix[x][y] == 0) {
                    adjMatrix[x][y] = r;
                    adjMatrix[y][x] = r;
                }
                else if(adjMatrix[x][y] > r && adjMatrix[y][x] > r ){
                    adjMatrix[x][y] = r;
                    adjMatrix[y][x] = r;
                }
            }
            //s is the source node
            int s = in.nextInt() - 1;

            //solving the problem

            int d[] = new int[n];
            int parent[] = new int[n];

            //set up d and parent arrays
            for (int i = 0; i < n; i++) {
                parent[i] = -1;
                d[i] = -1;
            }
            d[s] = 0;

            //initialise 'q'
            HashSet<Integer> unvisitedNodes = new HashSet<>();
            for(int i = 0; i < n; i++) { unvisitedNodes.add(i); }

            while(!unvisitedNodes.isEmpty()) {
                int u = getNodeWithLowestDFromSet(d, unvisitedNodes, s);
                if(u == -1) { break; }
                unvisitedNodes.remove(u);

                for (int v = 0; v < adjMatrix[u].length; v++) {
                    if(adjMatrix[u][v] == 0) { continue; }

                    int temp = d[u] + adjMatrix[u][v];
                    if(temp < d[v] || d[v] == -1) {
                        d[v] = temp;
                        parent[v] = u;
                    }
                }
            }

            printDistances(d, s);
        }
    }

    private static void printDistances(int[] d, int s) {
        String output = "";
        for (int i = 0; i < d.length; i++) {
            if(i == s) { continue; }

            output += d[i] + " ";
        }

        System.out.println(output);
    }

    private static int getNodeWithLowestDFromSet(int[] d, HashSet<Integer> set, int s) {
        int lowestD = Integer.MAX_VALUE;
        int lowestNode = -1;
        for (Integer node : set) {
            if(lowestD > d[node] && d[node] >= 0) {
                lowestD = d[node];
                lowestNode = node;
            }
        }

        return lowestNode;
    }

}
