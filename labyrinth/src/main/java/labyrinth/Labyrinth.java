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
        
        /*Scanner reader = new Scanner(System.in);
        System.out.println("Choose dimension of the map:\n");
        int x = reader.nextInt();
        int xx = x*x-1;
        System.out.println("Choose startpoint: " + 0 + "-" + xx);
        int s = reader.nextInt();
        System.out.println("Choose endpoint: " + 0 + "-" + xx);
        int e = reader.nextInt();
        Node[] foo = GraphBuilder.GraphBuilder(x, x);
        */
        Node[] foo = GraphBuilder.GraphBuilder(100, 100);
        
        
        nicePrint(foo);
        Dijkstra bar = new Dijkstra();       
        long start = System.currentTimeMillis(); 
        //double d = bar.search(foo, s, e);
        double d = bar.search(foo, 2000, 54);        
        long end = System.currentTimeMillis(); 
        System.out.println("Searching took: " + (end - start) + "ms. Fastest path is: " + d +".");
        
        Astar bar2 = new Astar();
        long start2 = System.currentTimeMillis(); 
        double d2 = bar2.search(foo, 2000, 54);        
        long end2 = System.currentTimeMillis(); 
        System.out.println("Searching took: " + (end2 - start2) + "ms. Fastest path is: " + d2 +".");
        
    }
    
    public static void nicePrint(Node[] map) {
        for (int i = 0; i < map.length; i++) {
            System.out.println(i + " , " + map[i]);
        }
    }    
}