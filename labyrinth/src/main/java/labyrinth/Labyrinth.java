package labyrinth;

import labyrinth.algo.Astar;
import labyrinth.algo.Dijkstra;
import labyrinth.algo.GraphBuilder;
import labyrinth.algo.Node;

/**.
 * @author Tuomas Junno
 */
public final class Labyrinth {

    /**
     * .
     * Main Labyrinth class
     */

    private Labyrinth() {

    }

    /**
     * .
     *
     * (testing for now)
     *
     * @param args args
     */
    public static void main(final String[] args) {

        /*
         * Scanner reader = new Scanner(System.in);
         * System.out.println("Choose dimension of the map:\n"); int x =
         * reader.nextInt(); int xx = x*x-1;
         * System.out.println ("Choose startpoint: " +
         * 0 + "-" + xx); int s = reader.nextInt();
         * System.out.println("Choose endpoint: " + 0 + "-" + xx); int e =
         * reader.nextInt(); Node[] foo = GraphBuilder.GraphBuilder(x, x);
         */
        final int x = 100;
        final int y = 100;
        final int start = 2000;
        final int end = 54;

        Node[] foo = GraphBuilder.builder(x, y);

        nicePrint(foo);
        Dijkstra bar = new Dijkstra();
        long starttimed = System.currentTimeMillis();
        double d = bar.search(foo, start, end);
        long endtimed = System.currentTimeMillis();
        System.out.println("Searching took: "
        + (endtimed - starttimed) + "ms. Fastest path is: " + d + ".");

        Astar bar2 = new Astar();
        long starttimea = System.currentTimeMillis();
        double d2 = bar2.search(foo, start, end);
        long endtimea = System.currentTimeMillis();
        System.out.println("Searching took: "
        + (endtimea - starttimea) + "ms. Fastest path is: " + d2 + ".");

    }

    /**
     * . Niceprint prints map nicely
     * @param map map
     */
    public static void nicePrint(final Node[] map) {
        for (int i = 0; i < map.length; i++) {
            System.out.println(i + " , " + map[i]);
        }
    }
}
