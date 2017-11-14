package labyrinth;
import java.util.*;
/**
 *
 * @author Tuomas Junno
 */
public class Labyrinth {
    
    /**
     * 
     */
    
    public Labyrinth(){
        
    }

    /**
     * Main
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
