package labyrinth.algo;

import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Tuomas Junno
 */
public class NodeTest {
    List<Node> nodes = new ArrayList<>();
    public NodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
               
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of setWeight, getWeight getX and getY methods, of class Node.
     */
    @Test
    public void testSetGetWeightAndXY() {
        System.out.println("testSetWeightGetWeightsAndGetXGetY");       
        for (int i = 0; i < 5000; i++) {
            Node n = new Node(1,5);
            Weight w = new Weight(1, 1.4);
            n.setWeight(w);
            nodes.add(n);
        }
        for (int i = 0; i < 5000; i++) {
            assertEquals(nodes.get(i).getX(), 1);
            assertEquals(nodes.get(i).getY(), 5);
            assertEquals(nodes.get(i).getWeights().size(), 1);
        }
    }

    /**
     * Test of toString method, of class Node.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        Node n = new Node(1,1);
        Weight w = new Weight(1, 1.4);
        n.setWeight(w);
        String expResult = "0 , x: 1, y: 1 weights:[1]";
        String result = n.toString();
        assertTrue(expResult.equals(result));
    }
    
}
