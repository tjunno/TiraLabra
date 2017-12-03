/*
 1  function Dijkstra(Graph, source):
2      dist[source] ← 0                                    // Initialization
3
4      create vertex set Q
5
6      for each vertex v in Graph:           
7          if v ≠ source
8              dist[v] ← INFINITY                          // Unknown distance from source to v
9              prev[v] ← UNDEFINED                         // Predecessor of v
10
11         Q.add_with_priority(v, dist[v])
12
13
14     while Q is not empty:                              // The main loop
15         u ← Q.extract_min()                            // Remove and return best vertex
16         for each neighbor v of u:                      // only v that is still in Q
17             alt ← dist[u] + length(u, v) 
18             if alt < dist[v]
19                 dist[v] ← alt
20                 prev[v] ← u
21                 Q.decrease_priority(v, alt)
22
23     return dist[], prev[]

*/

package labyrinth.algo;
import java.util.*;
/**
 * Dijkstras algorithm for searching
 * 
 * @author Tuomas Junno
 */
public class Dijkstra {
    private Node start;
    private Node end;
    private Node[] map;
    private PriorityQueue<Node> open;
    private Stack<Node> path;
        
    public Dijkstra(Node[] map, Node start, Node end){
        this.start = start;
        this.end = end;
        this.map = map;
        this.open = new PriorityQueue<>();
        this.path = new Stack<>();
    }
    
    public boolean search(){
        this.open.add(start);
    //    this.start.setStart(0);
    //    this.start.setPath(this.end);
        
        while (!this.open.isEmpty()) {
            Node current = this.open.poll();
            if (current.equals(end)){
                reconstructPath();
                return true;
            }
            else{
    //            current.setVisited();               
            }
            
            }
        return false;
        }
    
        public void reconstructPath(){
            Node node = this.end;
            while (!node.equals(this.start)){
                this.path.push(node);
    //            node = node.getParent();
            }
            this.path.push(node);
        }
    
    /*
    Relax(u,v,w)
1 if distance[v] > distance[u] + w(u,v)
2 distance[v] = distance[u]+w(u,v)
3 path[v] = u
    */
}
