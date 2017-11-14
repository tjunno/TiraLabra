
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
    
/**
 * 
 * @param x
 * @param y 
 */
    public Node(int x, int y){
        this.start = Integer.MAX_VALUE;
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

    private int getX() {
        return this.x;
    }

    private int getY() {
        return this.y;    
    }
    
    private int getEnd(){
        return this.end;
    }

    void setStart(int i) {
        this.start = i;
    }

    void setPath(Node end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}