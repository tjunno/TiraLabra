
package labyrinth;
import java.util.*;
/**
 * Implements node
 * @author Tuomas Junno
 */
public class Node {
    private int x,y;
    private int start;
    private int end;
    private Node parent;
    
/**
 * 
 * @param x
 * @param y 
 */
    public Node(int x, int y){
        this.start = Integer.MAX_VALUE;
        this.end = 0;
        this.x = x;
        this.y = y;
    }
/**
 * 
 * @param goal 
 */    
    public void setEnd(Node goal){
        this.end = Math.abs((this.getX()-goal.getX())+(this.getY()-goal.getY()));
    }
/**
 * 
 * @return x 
 */
    private int getX() {
        return this.x;
    }
/**
 * 
 * @return y
 */
    private int getY() {
        return this.y;    
    }
}