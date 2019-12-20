package labyrinth.algo;

import java.io.File;
import java.io.IOException;
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
     * . foo
     */
    private Node[] foo;
    /**
     * . foo2
     */
    private Node[] foo2;
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

    /**.
     * .f
     * @throws java.io.IOException io
     */
    @Before
    public void setUp() throws IOException {

        foo = GraphBuilder.builder(new File(
                "src/test/resources/labyrinth/testi.txt"));

        foo2 = GraphBuilder.builder(new File(
                "src/test/resources/labyrinth/testi3.txt"));
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
        final int a = 100;
        assertEquals(a, foo.length);
    }

    /**
     * Test of GraphBuilder method, of class GraphBuilder.
     */
    @Test
    public void testGraphBuilder2() {
        System.out.println("GraphBuilder");
        final int a = 63 * 63;
        assertEquals(a, foo2.length);
    }
}
