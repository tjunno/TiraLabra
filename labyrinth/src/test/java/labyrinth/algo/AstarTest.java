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
public class AstarTest {
        private final int x = 10;
        private final int y = 10;
        Node[] foo;
     /**
     * . f
     */
    public AstarTest() {
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

        foo = GraphBuilder.builder(x, y);

    }
     /**
     * . f
     */
    @After
    public void tearDown() {
    }
    
    /**
     * Test of search method, of class Astar.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        final int start = 1;
        final int end = 10;
        Astar star = new Astar();
        double d = star.search(foo, start, end);
        double d2 = 1.4;
        System.out.println(d);
        assertEquals(d, d2, 0.01);
    }
    /**
     * Test failing of search method, of class Astar.
     */
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testSearchFail() {
        final int start = 1;
        final int end = 1000;
        Astar star = new Astar();
        double d = star.search(foo, start, end);
        double d2 = 1.4;
        System.out.println(d);
        assertEquals(d, d2, 0.01);              
    }
    
    @Test
    public void testSearchSame() {
        final int start = 1;
        final int end = 1;
        Astar star = new Astar();
        double d = star.search(foo, start, end);
        double d2 = 0;
        System.out.println(d);
        assertEquals(d, d2, 0.01);              
    }
    /**
     * Test of reconstructPath method, of class Astar.
     *
    @Test
    public void testReconstructPath() {
        System.out.println("reconstructPath");
        // Astar instance = null;

    }*/

}
