package labyrinth;
import java.util.*;
import labyrinth.algo.*;
/**
 *
 * @author Tuomas Junno
 */
public class Labyrinth {
    
    /**
     * Main Labyrinth class
     */
    
    public Labyrinth(){
        
    }

    /**
     * Main
     * (testing for now)
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Node[][] laby = new Node[10][10];
        for (int i = 0; i < laby.length; i++) {
            for (int j = 0; j < laby[0].length; j++) {
                laby[i][j] = new Node(i, j);
            }
        }
    }    
}
