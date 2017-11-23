    /*
function A*(start, goal)
    // The set of nodes already evaluated
    closedSet := {}

    // The set of currently discovered nodes that are not evaluated yet.
    // Initially, only the start node is known.
    openSet := {start}

    // For each node, which node it can most efficiently be reached from.
    // If a node can be reached from many nodes, cameFrom will eventually contain the
    // most efficient previous step.
    cameFrom := an empty map

    // For each node, the cost of getting from the start node to that node.
    gScore := map with default value of Infinity

    // The cost of going from start to start is zero.
    gScore[start] := 0

    // For each node, the total cost of getting from the start node to the goal
    // by passing by that node. That value is partly known, partly heuristic.
    fScore := map with default value of Infinity

    // For the first node, that value is completely heuristic.
    fScore[start] := heuristic_cost_estimate(start, goal)

    while openSet is not empty
        current := the node in openSet having the lowest fScore[] value
        if current = goal
            return reconstruct_path(cameFrom, current)

        openSet.Remove(current)
        closedSet.Add(current)

        for each neighbor of current
            if neighbor in closedSet
                continue		// Ignore the neighbor which is already evaluated.

            if neighbor not in openSet	// Discover a new node
                openSet.Add(neighbor)
            
            // The distance from start to a neighbor
            tentative_gScore := gScore[current] + dist_between(current, neighbor)
            if tentative_gScore >= gScore[neighbor]
                continue		// This is not a better path.

            // This path is the best until now. Record it!
            cameFrom[neighbor] := current
            gScore[neighbor] := tentative_gScore
            fScore[neighbor] := gScore[neighbor] + heuristic_cost_estimate(neighbor, goal) 

    return failure

function reconstruct_path(cameFrom, current)
    total_path := [current]
    while current in cameFrom.Keys:
        current := cameFrom[current]
        total_path.append(current)
    return total_path

*/
package labyrinth.algo;

import java.util.*;

/**
 *
 * @author Tuomas Junno
 * 
 */
public class Astar {    
    private Node start,end;
    private PriorityQueue<Node> open;
    private ArrayList<Node> closed;
    private Node[][] map;
    private Stack<Node> path;
    
    
    /**
     * AStar algorithm for searching
     * 
     * @param map
     * @param start
     * @param end
     * @param open
     * @param closed
     */
    public Astar (Node[][] map, Node start, Node end){
        this.start = start;
        this.end = end;
        this.map  = map;
        this.open = new PriorityQueue<>();
        this.closed = new ArrayList<>();
    }
    /**
     * Will search the shortest path from start to end
     * 
     * @return boolean
     */
    
    public boolean search(){
        open.add(start);
        start.setStart(0);
        start.setPath(this.end);
        
        while (!open.isEmpty()) {
            Node current = open.poll();
            if (current.equals(start)){
                reconstructPath();
                return true;
            }
            open.remove(current);
            closed.add(current);                   
            }
        return false;
        }
    /**
     * Reconstructs path someday
     * 
     */
    
    public void reconstructPath(){
        Node node = this.end;
        while (!node.equals(this.start)){
            path.push(node);
            node = node.getParent();
        }
        path.push(node);
        
    }

}
