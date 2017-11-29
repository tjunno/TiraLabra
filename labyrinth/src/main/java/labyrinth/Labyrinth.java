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


        Node[] foo = GraphBuilder.GraphBuilder(10, 10);
        nicePrint(foo);
        
    }
    
    public static void nicePrint(Node[] graph) {
        for (int i = 0; i < graph.length; i++) {
            System.out.println(i + " , " + graph[i]);
        };
    }
}
