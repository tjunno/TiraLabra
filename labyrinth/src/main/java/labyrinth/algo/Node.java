
package labyrinth.algo;
import java.util.*;
/**
 * Implements node
 * 
 * @author Tuomas Junno
 */
public class Node{
    private int x,y;
    //private Weight[] weights;
    private List<Weight> weights;
    /**
    * 
    * @param x x-coordinate
    * @param y y-coordinate
 */
    public Node(int x, int y){
        this.x = x;
        this.y = y;
        this.weights = new ArrayList<>();
        //this.neighbors = new ArrayList<>();
    }
/*
 
 @param goal 
   
    public void setPath(Node goal){
        this.path = Math.abs((this.getX()-goal.getX())+(this.getY()-goal.getY()));
    }
*/
        //neighbors = new ArrayList<>();
    
    public List<Weight> getWeights(){
        return weights;
    }
    public void setWeight(Weight w){
        weights.add(w);
    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;    
    }
    
    @Override
    public String toString() {
        int[] array = new int[weights.size()];
        for (int i = 0; i < weights.size(); i++) {
            array[i] = weights.get(i).getI();
        }
        return "x: " + this.x + ", y: " + this.y + " weights:" + Arrays.toString(array);
    }

}