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
        /*
        Astar bar2 = new Astar();
        long start2 = System.currentTimeMillis(); 
        double d2 = bar2.search(foo, 0, 20);        
        long end2 = System.currentTimeMillis(); 
        System.out.println("Searching took: " + (end2 - start2) + "ms. Fastest path is: " + d2 +".");
        */
    }
    
    public static void nicePrint(Node[] map) {
        for (int i = 0; i < map.length; i++) {
            System.out.println(i + " , " + map[i]);
        }
    }    
}