package labyrinth.algo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Tuomas Junno
 */
public class AnodeTest {
    /**.
     * a
     */
    private Anode a;
    /**.
     * d
     */
    private final double d = 1.2;
    /**.
     * dd
     */
    private final double dd = 0.1;
    /**.
     * f
     */
    public AnodeTest() {
    }
    /**.
     * setup
     */
    @Before
    public void setUp() {
        Anode aa = new Anode(1, d, 2, 2);
        this.a = aa;
    }
    /**.
     * not use
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Anode.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        // Anode instance = null;
        int expResult = 1;
        // int result = instance.getId();
        int result = a.getId();
        assertEquals("Ids are not the same", expResult, result);

    }

    /**
     * Test of getX method, of class Anode.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        // Anode instance = null;
        int expResult = 2;
        // int result = instance.getX();
        int result = a.getX();
        assertEquals("X doesnt match", expResult, result);

    }

    /**
     * Test of getY method, of class Anode.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        // Anode instance = null;
        int expResult = 2;
        // int result = instance.getY();
        int result = a.getY();
        assertEquals("Y doesnt match", expResult, result);

    }

    /**
     * Test of getStart method, of class Anode.
     */
    @Test
    public void testGetStart() {
        System.out.println("getStart");
        // Anode instance = null;
        double expResult = d;
        // int result = instance.getStart();
        double result = a.getStart();
        assertEquals("Start doesnt match", expResult, result, dd);

    }

    /**
     * Test of getEnd method, of class Anode.
     */
    @Test
    public void testGetEnd() {
        System.out.println("getEnd");
        a.setEnd(d);
        double expResult = d;
        double result = a.getEnd();
        assertEquals("End doesnt match", expResult, result, dd);
    }

}
