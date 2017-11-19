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
public class NodeTest {
    
    public NodeTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEnd method, of class Node.
     */
    @Test
    public void testSetEnd() {
        System.out.println("setEnd");
        Node goal = null;
        Node instance = null;
        //instance.setEnd(goal);
    }

    /**
     * Test of setStart method, of class Node.
     */
    @Test
    public void testSetStart() {
       //System.out.println("setStart");
        //int i = 0;
        //Node instance = null;
        //instance.setStart(i);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPath method, of class Node.
     */
    @Test
    public void testSetPath() {
        //System.out.println("setPath");
        //Node end = null;
        //Node instance = null;
        //instance.setPath(end);
    }

    /**
     * Test of getParent method, of class Node.
     */
    @Test
    public void testGetParent() {
        System.out.println("getParent");
        Node instance = null;
        Node expResult = null;
        Node result = instance.getParent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParent method, of class Node.
     */
    @Test
    public void testSetParent() {
        System.out.println("setParent");
        Node parent = null;
        Node instance = null;
        instance.setParent(parent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisited method, of class Node.
     */
    @Test
    public void testSetVisited() {
        System.out.println("setVisited");
        Node instance = null;
        instance.setVisited();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVisited method, of class Node.
     */
    @Test
    public void testIsVisited() {
        System.out.println("isVisited");
        Node instance = null;
        boolean expResult = false;
        boolean result = instance.isVisited();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
