package labyrinth.algo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Tuomas Junno
 */
public final class GraphBuilder {

    private GraphBuilder() {
        throw new IllegalStateException("Utility class");
    }

    /**.
     * THE GraphBuilder
     *
     * @param f map file
     * @return graph
     * @throws java.io.FileNotFoundException file not found
     * @throws java.io.IOException io exception
     */

    public static Node[] builder(final File f) throws FileNotFoundException,
    IOException {
        Character cc = ' ';
        BufferedReader read = new BufferedReader(new FileReader(f));
        String line = read.readLine();
        String[] split = line.split(" ");
        Integer x = Integer.valueOf(split[0]);
        Integer y = Integer.valueOf(split[1]);
        String readline;
        int n = 0;
        char[][] laby = new char[x][y];
        while ((readline = read.readLine()) != null) {
            char[] ch = readline.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                laby[i][n] = ch[i];
            }
            n++;
        }
        read.close();

        Node[] g = new Node[x * y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Node node = new Node(j, i);
                char c = laby[node.getX()][node.getY()];
                if (c == cc) {
                    addWeights(node, laby, x, y);
                }
                //if (c==cc) addWeights(node, x, y);

                g[i * x + j] = node;
            }
        }
        return g;
    }

    /**.
     * * Very classy way to add weights 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
     * 16 17 18 19 20 21 22 23 24
     *
     * @param node The node which gonna be stuffed with weights
     * @param c map
     * @param x X-coordinate
     * @param y Y-coordinate
     */
    public static void addWeights(final Node node, final char[][] c,
     final int x, final int y) {
        final var m = 1.4;
        Character cc = ' ';
        int p = node.getX() + (node.getY() * x);
        if (node.getX() == 0 && node.getY() == 0) {
            if (c[node.getX()][node.getY() + 1] == cc) {
                node.setWeight(new Weight(2, 1));
            }
            if (c[node.getX() + 1][node.getY()] == cc) {
                node.setWeight(new Weight(x, 1));
            }
            if (c[node.getX() + 1][node.getY() + 1] == cc) {
                node.setWeight(new Weight(x + 1, m));
            }
        } else if (node.getY() == 0 && node.getX() == x - 1) {
            if (c[node.getX() - 1][node.getY()] == cc) {
                node.setWeight(new Weight(p - 1, 1));
            }
            if (c[node.getX()][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x, 1));
            }
            if (c[node.getX() - 1][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x - 1, m));
            }
        } else if (node.getY() == 0) {
            if (c[node.getX() - 1][node.getY()] == cc) {
                node.setWeight(new Weight(p - 1, 1));
            }
            if (c[node.getX() + 1][node.getY()] == cc) {
                node.setWeight(new Weight(p + 1, 1));
            }
            if (c[node.getX()][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x, 1));
            }
            if (c[node.getX() + 1][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x + 1, m));
            }
            if (c[node.getX() - 1][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x - 1, m));
            }
        } else if (node.getX() == 0 && node.getY() == y - 1) {
            if (c[node.getX()][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x, 1));
            }
            if (c[node.getX() + 1][node.getY()] == cc) {
                node.setWeight(new Weight(p + 1, 1));
            }
            if (c[node.getX() + 1][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x + 1, m));
            }
        } else if (node.getX() == x - 1 && node.getY() == y - 1) {
            if (c[node.getX()][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x, 1));
            }
            if (c[node.getX() - 1][node.getY()] == cc) {
                node.setWeight(new Weight(p - 1, 1));
            }
            if (c[node.getX() - 1][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x - 1, m));
            }
        } else if (node.getX() == 0) {
            if (c[node.getX()][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x, 1));
            }
            if (c[node.getX() + 1][node.getY()] == cc) {
                node.setWeight(new Weight(p + 1, 1));
            }
            if (c[node.getX()][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x, 1));
            }
            if (c[node.getX() + 1][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x + 1, m));
            }
            if (c[node.getX() + 1][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x + 1, m));
            }
        } else if (node.getX() == x - 1) {
            if (c[node.getX()][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x, 1));
            }
            if (c[node.getX() - 1][node.getY()] == cc) {
                node.setWeight(new Weight(p - 1, 1));
            }
            if (c[node.getX() + 1][node.getY()] == cc) {
                node.setWeight(new Weight(p + 1, 1));
            }
            if (c[node.getX() - 1][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x - 1, m));
            }
            if (c[node.getX() - 1][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x - 1, m));
            }
        } else if (node.getY() == y - 1) {
            if (c[node.getX()][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x, 1));
            }
            if (c[node.getX() - 1][node.getY()] == cc) {
                node.setWeight(new Weight(p - 1, 1));
            }
            if (c[node.getX() + 1][node.getY()] == cc) {
                node.setWeight(new Weight(p + 1, 1));
            }
            if (c[node.getX() - 1][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x - 1, m));
            }
            if (c[node.getX() + 1][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x + 1, m));
            }
        } else {
            if (c[node.getX()][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x, 1));
            }
            if (c[node.getX() - 1][node.getY()] == cc) {
                node.setWeight(new Weight(p - 1, 1));
            }
            if (c[node.getX() + 1][node.getY()] == cc) {
                node.setWeight(new Weight(p + 1, 1));
            }
            if (c[node.getX()][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x, 1));
            }
            if (c[node.getX() - 1][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x - 1, m));
            }
            if (c[node.getX() + 1][node.getY() - 1] == cc) {
                node.setWeight(new Weight(p - x + 1, m));
            }
            if (c[node.getX() - 1][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x - 1, m));
            }
            if (c[node.getX() + 1][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x + 1, m));
            }
        }
    }

}
