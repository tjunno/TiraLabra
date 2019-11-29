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
public class ACompTest {
    /**.
     * Nodes
     */
    public ACompTest() {
    }
    /**.
     * Nodes
     */
    @BeforeClass
    public static void setUpClass() {
    }
    /**.
     * Nodes
     */
    @AfterClass
    public static void tearDownClass() {
    }
    /**.
     * Nodes
     */
    @Before
    public void setUp() {
    }
    /**.
     * Nodes
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of compare method, of class AComp.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Anode o1 = new Anode(1, 1, 1, 1);
        Anode o2 = new Anode(1, 1, 1, 1);
        AComp instance = new AComp(1, 1);
        int expResult = 0;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompare2() {
        System.out.println("compare");
        Anode o1 = new Anode(1, 1, 1, 1);
        Anode o2 = new Anode(1, 2, 1, 2);
        AComp instance = new AComp(1, 1);
        int expResult = -1;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompare3() {
        System.out.println("compare");
        Anode o1 = new Anode(1, 2, 1, 2);
        Anode o2 = new Anode(1, 1, 1, 1);
        AComp instance = new AComp(1, 1);
        int expResult = 1;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
    }
}
