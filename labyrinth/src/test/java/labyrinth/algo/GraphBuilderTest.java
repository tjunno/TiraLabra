package labyrinth.algo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author Tuomas Junno
 */
public class GraphBuilderTest {
    /**
     * . GraphBuilderTest
     */
    public GraphBuilderTest() {
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

    /**
     * Test of GraphBuilder method, of class GraphBuilder.
     */
    @Test
    public void testGraphBuilder() {
        System.out.println("GraphBuilder");
        int x = 2;
        int y = 2;
        final int a = 4;
        Node[] result = GraphBuilder.builder(x, y);
        assertEquals(a, result.length);

    }

    /**
     * Test of addWeights method, of class GraphBuilder.
     */
    @Test
    public void testAddWeights() {
        System.out.println("addWeights");
        Node node = new Node(0, 0);
        int x = 1;
        int y = 1;
        // GraphBuilder instance = new GraphBuilder();
        GraphBuilder.addWeights(node, x, y);
        // String expResult = "";
        assertEquals(0, 0);

    }

}
