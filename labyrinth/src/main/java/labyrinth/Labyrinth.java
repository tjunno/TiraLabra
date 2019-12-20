package labyrinth;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import labyrinth.algo.Astar;
import labyrinth.algo.Dijkstra;
import labyrinth.algo.GraphBuilder;
import labyrinth.algo.Node;

/**
 * .
 * @author Tuomas Junno
 */
public final class Labyrinth {

    /**
     * .
     * Main Labyrinth class
     */
    private Labyrinth() {

    }

    /**.
     * Runs algorithms at labyrinth
     *
     *
     * @param args args
     * @throws java.io.IOException io
     */
    public static void main(final String[] args) throws IOException {

        int start;
        int end;
        Node[] foo;
        int x;
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Choose case: 1, 2, 3, 4 or 5:\n");
            start = 0;
            end = 0;
            foo = null;
            x = reader.nextInt();
        }

        switch (x) {
            case 1:
                start = 57;
                end = 3965;
                foo = GraphBuilder.builder(
                        new File("src/main/resources/labyrinth/testi.txt"));
                break;
            case 2:
                start = 189;
                end = 3445;

                foo = GraphBuilder.builder(new File(
                        "src/main/resources/labyrinth/test2.txt"));
                break;
            case 3:
                start = 5;
                end = 3929;

                foo = GraphBuilder.builder(new File(
                        "src/main/resources/labyrinth/test3.txt"));
                break;
            case 4:
                start = 2678;
                end = 17629;

                foo = GraphBuilder.builder(new File(
                        "src/main/resources/labyrinth/test4.txt"));
                break;
            case 5:
                start = 1529;
                end = 18118;

                foo = GraphBuilder.builder(new File(
                        "src/main/resources/labyrinth/test5.txt"));
                break;
            default:
                System.out.println("Insert correct number");
        }
        if (start != 0) {
            nicePrint(foo);
            Dijkstra bar = new Dijkstra();
            long starttimed = System.currentTimeMillis();
            double d = bar.search(foo, start, end);
            long endtimed = System.currentTimeMillis();
            //System.out.println("Searching took: "
            //+ (endtimed - starttimed) + "ms. Fastest path is: " + d + ".");

            Astar bar2 = new Astar();
            long starttimea = System.currentTimeMillis();
            double d2 = bar2.search(foo, start, end);
            long endtimea = System.currentTimeMillis();

            if (d == -1) {
                System.out.println("Astar didn't find path!");
            } else {
                System.out.println("Searching with Astar took: "
                        + (endtimea - starttimea)
                        + "ms. Fastest path is: " + d2 + ".");
            }
            if (d2 == -1) {
                System.out.println("Djikstra didn't find path!");
            } else {
                System.out.println("Searching with Djikstra took: "
                        + (endtimed - starttimed)
                        + "ms. Fastest path is: " + d + ".");
            }
        }
        //System.out.println("Searching with Astar took: "
        //+ (endtimea - starttimea) + "ms. Fastest path is: " + d2 + ".");
    }

    /**
     * . nicePrint nodes of the map nicely
     *
     * @param map map
     */
    public static void nicePrint(final Node[] map) {
        for (int i = 0; i < map.length; i++) {
            System.out.println(i + " , " + map[i]);
        }
    }
}
