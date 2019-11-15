package labyrinth.algo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Tuomas Junno
 */
public class NodeTest {
    /**.
     * Nodes
     *
     */
   private List<Node> nodes = new ArrayList<>();

    /**
     * . f
     */
    public NodeTest() {
    }

     /**
     * . f
     */
    @BeforeClass
    public static void setUpClass() {
    }
     /**
     * . f
     */
    @AfterClass
    public static void tearDownClass() {
    }
     /**
     * . f
     */
    @Before
    public void setUp() {

    }
     /**
     * . f
     */

    @After
    public void tearDown() {
    }

    /**.
     * Test of setWeight, getWeight getX and getY methods, of class Node.
     *
     */
    @Test
    public void testSetGetWeightAndXY() {
        final int m = 5000;
        final int m2 = 5;
        final var m3 = 1.4;
        System.out.println("testSetGetWeightAndXY");
        for (int i = 0; i < m; i++) {
            Node n = new Node(1, m2);
            Weight w = new Weight(1, m3);
            n.setWeight(w);
            nodes.add(n);
        }
        for (int i = 0; i < m; i++) {
            assertEquals(nodes.get(i).getX(), 1);
            assertEquals(nodes.get(i).getY(), m2);
            assertEquals(nodes.get(i).getWeights().size(), 1);
        }
    }

    /**
     * Test of toString method, of class Node.
     */
    //@Ignore
    @Test
    public void testToString() {
        final var m3 = 1.4;
        System.out.println("toString");
        Node n = new Node(1, 1);
        Weight w = new Weight(1, m3);
        n.setWeight(w);
        String expResult = "x: 1, y: 1 weights:[1]";
        String result = n.toString();
        assertTrue(expResult.equals(result));
    }

}
