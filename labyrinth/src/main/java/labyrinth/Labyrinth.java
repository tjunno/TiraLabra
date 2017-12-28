package labyrinth;
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
        Node[] foo = GraphBuilder.GraphBuilder(5, 5);
        nicePrint(foo);
        Dijkstra bar = new Dijkstra();
        long start = System.currentTimeMillis(); 
        double d = bar.search(foo, 0, 20);
        long end = System.currentTimeMillis(); 
        System.out.println("Searching took: " + (end - start) + "ms. Fastest path is: " + d +".");
    }
    
    public static void nicePrint(Node[] map) {
        for (int i = 0; i < map.length; i++) {
            System.out.println(i + " , " + map[i]);
        }
    }    
}
