
package labyrinth.algo;
import java.util.*;
/**
 * Class representing a node that has X- and Y-coordinate and list of weights
 * 
 * @author Tuomas Junno
 */
public class Node{
    private final int x,y;
    //private Weight[] weights;
    private final List<Weight> weights;
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
   
    public void setPath(Node end){
        this.path = Math.abs((this.getX()-end.getX())+(this.getY()-end.getY()));
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

    double getStart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double getEnd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}