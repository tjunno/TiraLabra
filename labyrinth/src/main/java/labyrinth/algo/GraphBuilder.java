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
public interface GraphBuilder {

    /*private GraphBuilder() {
        throw new IllegalStateException("Utility class");
    }*/

    /**.
     * THE GraphBuilder builds from the map file
     *
     * @param f map file
     * @return graph
     * @throws java.io.FileNotFoundException file not found
     * @throws java.io.IOException io exception
     */

    static Node[] builder(final File f) throws FileNotFoundException,
    IOException {
        Character cc = ' ';
        BufferedReader read = new BufferedReader(new FileReader(f));
        String line = read.readLine();
        String[] split = line.split(" ");
        Integer x = Integer.valueOf(split[0]);
        Integer y = Integer.valueOf(split[1]);
        String rl;
        int n = 0;
        char[][] laby = new char[x][y];
        while ((rl = read.readLine()) != null) {
            char[] ch = rl.toCharArray();
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
                g[i * x + j] = node;
            }
        }
        return g;
    }

    /**.
     * * Very classy way to add weights
     *
     * @param node The node which gonna be stuffed with weights
     * @param c map
     * @param x X-coordinate
     * @param y Y-coordinate
     */
    static void addWeights(final Node node, final char[][] c,
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
            } /*
        } else if (node.getY() == 0 && node.getX() == x - 1) {
            if (c[node.getX() - 1][node.getY()] == cc) {
                node.setWeight(new Weight(p - 1, 1));
            }
            if (c[node.getX()][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x, 1));
            }
            if (c[node.getX() - 1][node.getY() + 1] == cc) {
                node.setWeight(new Weight(p + x - 1, m));
            } */
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
            } /*
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
            }*/
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
            } /*
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
            }*/
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
