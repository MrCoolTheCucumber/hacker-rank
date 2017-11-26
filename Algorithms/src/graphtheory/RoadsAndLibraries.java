package graphtheory;

import java.util.*;

public class RoadsAndLibraries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt(); // number of cities
            int m = in.nextInt(); // number of roads
            long x = in.nextLong(); // Clib
            long y = in.nextLong(); // Croad

            // Build adjacency list
            ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adjList.add(new ArrayList<>());
            }
            for (int a1 = 0; a1 < m; a1++) {
                int city_1 = in.nextInt() - 1;
                int city_2 = in.nextInt() - 1;
                adjList.get(city_1).add(city_2);
                adjList.get(city_2).add(city_1);
            }

            if (x <= y || m == 0) {
                System.out.println(x * n);
                continue;
            }

            // Find number of connected components
            // For each node perform DFS is it has not been visited.
            HashSet<Integer> visitedNodes = new HashSet<>(n);
            // 'root' , size
            HashMap<Integer, Integer> connectedComponents = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (visitedNodes.contains(i)) {
                    continue;
                }

                connectedComponents.put(i, 0);

                Stack<Integer> s = new Stack<>();
                s.push(i);
                while (!s.empty()) {
                    int v = s.pop();
                    if (!visitedNodes.contains(v)) {
                        visitedNodes.add(v);
                        connectedComponents.put(i, connectedComponents.get(i) + 1);
                        adjList.get(v).forEach(s::push);
                    }
                }
            }

            //calculate cost
            long cost = 0;
            for (int key : connectedComponents.keySet()) {
                cost += x;
                cost += (connectedComponents.get(key) - 1) * y;
            }

            System.out.println(cost);
        }
    }
}
