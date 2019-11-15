package labyrinth.algo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author tjunno
 */
public class DCompTest {
     /**
     * . f
     */
    public DCompTest() {
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
     * Test of compare method, of class DComp.
     */

    @Test
    public void test() {

    }
    /*
     * public void testCompare() { System.out.println("compare");
     * Weight o1 = new
     * Weight(1, 1); Weight o2 = new Weight(2, 2); DComp instance =
     * new DComp(); int
     * expResult = 0; int result = instance.compare(o1, o2);
     * assertEquals(expResult,
     * result);
     *
     * }
     */

    /**
     * Test of compare method, of class DComp.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Weight o1 = new Weight(1, 1);
        Weight o2 = new Weight(1, 1);
        DComp instance = new DComp();
        int expResult = 0;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
    }
}
