package labyrinth.struct;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import labyrinth.algo.DComp;
import labyrinth.algo.Node;
//import java.util.*;
//import org.junit.Ignore;

/**
 *
 * @author Tuomas Junno
 */
public class MinHeapTest {
    /**.
     * minheaptest
     */
    private MinHeap<Node> heap;

    // public MinHeapTest() {
    // this.heap = new MinHeap(new DComp());
    // }

    /**
     * . sfad
     */
    public MinHeapTest() {
        @SuppressWarnings({ "unchecked", "rawtypes" })
        MinHeap<Node> minHeap = new MinHeap(new DComp());
        this.heap = minHeap;

    }
    /**
     * . sfad
     */
    @BeforeClass
    public static void setUpClass() {
    }
    /**
     * . sfad
     */
    @AfterClass
    public static void tearDownClass() {
    }
    /**
     * . sfad
     */
    @Before
    public void setUp() {
    }
    /**
     * . sfad
     */
    @After
    public void tearDown() {
    }
    /**
     * . sfad
     */
    @Test
    public void testSomeMethod() {
    }

    /**
     * Test of add method, of class MinHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        // heap.add(new Node(1,1));
        // heap.add(new Node(2,2));
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
