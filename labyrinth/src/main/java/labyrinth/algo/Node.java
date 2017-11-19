
package labyrinth.algo;
import java.util.*;
/**
 * Implements node
 * @author Tuomas Junno
 */
public class Node{
    private int x,y;
    private int start;
    private int end;
    private int path;
    private ArrayList<Node> neighbors;
    private Node parent;
    private boolean visited;
/**
 * 
 * @param x
 * @param y 
 */
    public Node(int x, int y){
        this.start = Integer.MAX_VALUE;
        this.x = x;
        this.y = y;
        this.neighbors = new ArrayList<>();
        this.parent = null;
    }
/**
 * 
 * @param goal 
 */    
    public void setPath(Node goal){
        this.path = Math.abs((this.getX()-goal.getX())+(this.getY()-goal.getY()));
    }

    private int getX() {
        return this.x;
    }

    private int getY() {
        return this.y;    
    }
    
    private int getPath(){
        return this.path;
    }

    void setStart(int start) {
        this.start = start;
    }
    
    Node getParent() {
        return parent;
    }
    
    void setParent(Node parent) {
        this.parent = parent;
    }

    void setVisited() {
        this.visited = true;
    }
    
    boolean isVisited() {
        return this.visited;
    }
    /*
    void setNeightbors(){
        
    }
    
    ArrayList<Node> getNeighbors(){
        
    }
    */


    
}