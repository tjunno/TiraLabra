package labyrinth.algo;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Tuomas Junno
 */
public class WeightTest {
     /**
     * . f
     */
    public WeightTest() {
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
     * Test of getI method, of class Weight.
     */
    @Test
    public void testGetIGetW() {
        final int m = 10;
        ArrayList<Weight> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(new Weight(i, i * m));
        }
        for (int i = 0; i < m; i++) {
            System.out.println("getI");
            assertTrue(list.get(i).getI() == i);
            System.out.println("getW");
            assertTrue(list.get(i).getW() == i * m);
        }
    }
}
