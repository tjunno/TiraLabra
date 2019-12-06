package labyrinth.algo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Tuomas Junno
 */
public class DijkstraTest {
    /**.
     * x
     */
    private final int x = 10;
    /**.
    * y
    */
    private final int y = 10;
    /**.
    *  foo
    */
    private Node[] foo;
     /**
     * . f
     */
    public DijkstraTest() {
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
        Dijkstra dij = new Dijkstra();
        double d = dij.search(foo, start, end);
        double d2 = 1.4;
        System.out.println(d);
        assertEquals(d, d2, 0.01);
    }
    /**
     * Test failing of search method, of class Dijkstra.
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSearchFail() {
        final int start = 1;
        final int end = 100;
        Dijkstra dij = new Dijkstra();
        double d = dij.search(foo, start, end);
        double d2 = 1.4;
        System.out.println(d);
        assertEquals(d2, d, 0.01);
    }

    /**.
     * Test failing of search method, of class Dijkstra.
     */
    @Test
    public void testSearchSame() {
        System.out.println("search");
        final int start = 1;
        final int end = 1;
        Dijkstra dij = new Dijkstra();
        double d = dij.search(foo, start, end);
        double d2 = 0;
        System.out.println(d);
        assertEquals(d2, d, 0.01);
    }

    /*
     * Test of reconstructPath method, of class Dijkstra.
     *
    @Test
    public void testReconstructPath() {
        System.out.println("reconstructPath");

        boolean expResult = false;
        assertEquals(expResult, expResult);
    }*/

}
