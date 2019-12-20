package labyrinth.algo;

import java.io.File;
import java.io.IOException;
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
    *  foo
    */
    private Node[] foo;
    /**.
    *  foo2
    */
    private Node[] foo2;
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
     /**.
     * .f
     * @throws java.io.IOException io
     */
    @Before
    public void setUp() throws IOException {

        foo = GraphBuilder.builder(new File("src/test/resources/testi.txt"));
        foo2 = GraphBuilder.builder(new File("src/test/resources/testi2.txt"));

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
        double d2 = 2;
        System.out.println(d);
        assertEquals(d2, d, 0.01);
    }
    /**
     * Test failing of search method, of class Dijkstra.
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSearchFail() {
        final int start = 1;
        final int end = 1000;
        Dijkstra dij = new Dijkstra();
        double d = dij.search(foo2, start, end);
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

    /**.
     * Test failing of search method, of class Dijkstra.
     */
    @Test
    public void testSearchNoRoute() {
        System.out.println("search");
        final int start = 1;
        final int end = 50;
        Dijkstra dij = new Dijkstra();
        double d = dij.search(foo2, start, end);
        double d2 = -1;
        System.out.println(d);
        assertEquals(d2, d, 0.01);
    }
}
