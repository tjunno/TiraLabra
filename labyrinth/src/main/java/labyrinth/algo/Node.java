
package labyrinth.algo;
import java.util.*;
/**
 * Implements node
 * 
 * @author Tuomas Junno
 */
public class Node{
    private int x,y;
    private Weight[] weights;

    /**
    * 
    * @param x x-coordinate
    * @param y y-coordinate
    * @param edges Edges of the node
 */
    public Node(int x, int y){
        this.x = x;
        this.y = y;
        //this.neighbors = new ArrayList<>();
    }
/*
 
 @param goal 
   
    public void setPath(Node goal){
        this.path = Math.abs((this.getX()-goal.getX())+(this.getY()-goal.getY()));
    }
*/
    public Weight[] getWeights(){
        return weights;
    }
    
    private int getX() {
        return this.x;
    }

    private int getY() {
        return this.y;    
    }
}