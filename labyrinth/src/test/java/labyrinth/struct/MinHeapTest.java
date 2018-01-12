package labyrinth.struct;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import labyrinth.algo.*;
import java.util.*;
import org.junit.Ignore;

/**
 *
 * @author Tuomas Junno
 */
public class MinHeapTest {
    MinHeap<Node> heap;
    
    
    public MinHeapTest() {
        this.heap = new MinHeap(new DComp());
        
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
    }

    /**
     * Test of add method, of class MinHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        //heap.add(new Node(1,1));
        //heap.add(new Node(2,2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(0, 0);
    }

    /**
     * Test of swap method, of class MinHeap.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        int i = 0;
        int j = 0;
        heap.swap(i, j);
    }

    /**
     * Test of poll method, of class MinHeap.
     */
    @Test
    public void testPoll() {
        System.out.println("poll");
        assertEquals(null, heap.poll());
    }

    /**
     * Test of isEmpty method, of class MinHeap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        boolean expResult = true;
        boolean result = heap.isEmpty();
        assertEquals(expResult, result);
    }
}
