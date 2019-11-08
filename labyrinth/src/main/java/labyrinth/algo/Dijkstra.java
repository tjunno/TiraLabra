/*
 1  function Dijkstra(Graph, source):
2      dist[source] ← 0                                    // Initialization
3
4      create vertex set Q
5
6      for each vertex v in Graph:
8              dist[v] ← INFINITY       // Unknown distance from source to v
9              prev[v] ← UNDEFINED                         // Predecessor of v
10
11         Q.add_with_priority(v, dist[v])
12
13
14     while Q is not empty:                              // The main loop
15         u ← Q.extract_min()    // Remove and return best vertex
16         for each neighbor v of u:  // only v that is still in Q
17             alt ← dist[u] + length(u, v)
18             if alt < dist[v]
19                 dist[v] ← alt
20                 prev[v] ← u
21                 Q.decrease_priority(v, alt)
22
23     return dist[], prev[]

*/

package labyrinth.algo;
// import java.util.*;
import labyrinth.struct.MinHeap;;
/**.
 * Dijkstras algorithm for searching
 *
 * @author Tuomas Junno
 */

public class Dijkstra {
/**.
 * Dijkstra algorithm
 * @param map Graph to be searched
 * @param start Start of the search
 * @param end End of the search
 * @return path cost for now
 */
    public double search(final Node[] map, final int start, final int end) {
        MinHeap<Weight> prio = new MinHeap<>(new DComp());
        //PriorityQueue<Weight> prio = new PriorityQueue<>(new DComp());
        double[] dist = new double[map.length + 1];
        int[] path = new int[map.length + 1];
        boolean[] visited = new boolean[map.length + 1];
        for (int i = 0; i <= map.length; i++) {
            dist[i] = Integer.MAX_VALUE;
            path[i] = -1;
        }
        dist[start] = 0;
        prio.add(new Weight(start, 0));
        while (!prio.isEmpty()) {
            Weight weight = prio.poll();
            int i = weight.getI();
            double distance = weight.getW();
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            for (Weight next:map[i].getWeights()) {
                if (dist[next.getI()] > distance + next.getW()) {
                    if (dist[next.getI()] > distance + next.getW()) {
                        dist[next.getI()] = distance + next.getW();
                        path[next.getI()] = i;
                        prio.add(new Weight(next.getI(), dist[next.getI()]));
                    }
                }
            }
        }
        /* stream
        while(!prio.isEmpty()){
            Weight weight = prio.poll();
            int i = weight.getI();
            double distance = weight.getW();
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            map[i].getWeights().stream()
            .filter((next) -> (dist[next.getI()] > distance + next.getW()))
            .map((next) -> {
                dist[next.getI()] = (distance + next.getW());
                return next;
            }).map((next) -> {
                path[next.getI()] = i;
                return next;
            }).forEach((next) -> {
                prio.add(new Weight(next.getI(),dist[next.getI()]));
            });
        }*/
        if (dist[end] == Integer.MAX_VALUE) {
            return -1;
        }
        reconstructPath(path, start, end);
        return dist[end];
    }
    /**.
     * Construct the path
     * @param path Path
     * @param start Start
     * @param end End
     */
    private void reconstructPath(final int[] path,
    final int start, final int end) {
        int next = end;
        while (true) {
            System.out.println("Path at tile \n" + next);
            if (path[next] == -1) {
                return;
            }
            next = path[next];
            if (next == start) {
                return;
            }
        }
    }
}

