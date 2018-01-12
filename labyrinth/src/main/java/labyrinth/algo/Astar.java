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
import labyrinth.struct.MinHeap;

/**
 *
 * @author Tuomas Junno
 * 
 */

public class Astar {   
    /**
     * AStar algorithm for searching (under construction)
     * 
     * @param map
     * @param start
     * @param end
     * @return 
     */     
    public double search(Node[] map, int start, int end){  
        if (start == end){
            return 0;
        }
        
        double[] tostart = new double[map.length+1];
        int[] path = new int[map.length+1];
        boolean[] visited = new boolean[map.length+1];
        for (int i = 0; i <= map.length; i++) {
            tostart[i] = Integer.MAX_VALUE;
            path[i] = -1;          
        }          
        
        tostart[start] = 0;
        //PriorityQueue<Anode> prio = new PriorityQueue<>(map.length, new AComp(map[end].getX(), map[end].getY()));
        MinHeap<Anode> prio = new MinHeap<>(map.length, new AComp(map[end].getX(), map[end].getY()));
        prio.add(new Anode(start, tostart[start], map[start].getX(), map[start].getY()));       
        while(!prio.isEmpty()){
            Anode anode = prio.poll();
            int i = anode.getId();
            if(visited[i]){
                continue;
            }
            
            visited[i] = true;
            for (int j = 0; j < map[i].getWeights().size(); j++) {
                Weight next = map[i].getWeights().get(j);
                if(tostart[next.getI()] > tostart[i] + next.getW()){
                    tostart[next.getI()] = tostart[i] + next.getW();
                    prio.add(new Anode(next.getI(), tostart[next.getI()], map[next.getI()].getX(), map[next.getI()].getY()));
                    path[next.getI()] = i;
                }
            }
        }
        if (tostart[end] == Integer.MAX_VALUE){
            return -1;
        }
        reconstructPath(path,start,end);
        return tostart[end];       
    }
    
    /**
     * Show us the path
     * @param path Path
     * @param start Start
     * @param end End
     */
    private void reconstructPath(int[] path, int start, int end){
        int next = end;
        while(true){
            System.out.println("Path at tile \n" + next);
            if(path[next] == -1){
                return;
            }
            next = path[next];
            if(next == start){
                return;
            }
        }
    }

}
