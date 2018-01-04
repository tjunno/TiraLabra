package labyrinth.algo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tuomas Junno
 */
public class ACompTest {
    
    public ACompTest() {
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
    
}
