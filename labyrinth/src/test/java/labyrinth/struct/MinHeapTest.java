package labyrinth.struct;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import labyrinth.algo.DComp;
import labyrinth.algo.Node;
import labyrinth.algo.Weight;
import static org.junit.Assert.assertEquals;
//import labyrinth.algo.Weight;
//import static org.junit.Assert.assertEquals;
//import java.util.*;
import org.junit.Ignore;

/**
 *
 * @author Tuomas Junno
 */
public class MinHeapTest {
    /**.
     * minheaptest
     */
    private MinHeap<Weight> heap;
    /*
     * init size
     */


     //public MinHeapTest() {
    // this.heap = new MinHeap(new DComp());
    // }


    /*
     * . sfad
     *
    public MinHeapTest() {
        @SuppressWarnings({ "unchecked", "rawtypes" })
        //MinHeap<Node> minHeap = new MinHeap(new DComp());
        //this.heap = minHeap;


    }
    */
    /**
     * . setUpClass
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
     * . set things up
     */
    @Before
    public void setUp() {
        @SuppressWarnings({ "unchecked", "rawtypes" })
        MinHeap<Weight> minHeap = new MinHeap(new DComp());
        this.heap = minHeap;

    }
    /**
     * . tear things down
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class MinHeap.
     */
    @Test
    public void testAddSwap() {
        Weight w = new Weight(1,1);
        Weight w2 = new Weight(1,2);
        System.out.println("add");
        heap.add(w);
        heap.add(w2);
        heap.swap(1, 2);
        assertFalse("Should not be empty", heap.isEmpty());
        assertEquals(2, heap.size());
        assertEquals(w2, heap.poll());
        assertEquals(w, heap.poll());
    }

    /**
     * Test of poll method, of class MinHeap.
     */
    @Test
    public void testPoll() {
        System.out.println("poll");
        heap.add(new Weight(1, 1));
        heap.poll();
        assertTrue("Heap is not empty, poll failed", heap.isEmpty());
    }

    /**
     * Test of isEmpty method, of class MinHeap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        assertTrue("Heap is not empty, heap is failing", heap.isEmpty());
    }
}
