package labyrinth.struct;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Ignore;
import org.junit.Test;

import labyrinth.algo.DComp;
import labyrinth.algo.Node;
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
    private MinHeap<Node> heap;
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


    }*/
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
        MinHeap<Node> minHeap = new MinHeap(new DComp());
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
    public void testAdd() {
        System.out.println("add");
        heap.add(new Node(1, 1));
        assertFalse("Should not be empty", heap.isEmpty());
    }

    /**
     * Test of swap method, of class MinHeap.
     */
    @Ignore
    @Test
    public void testSwap() {
        System.out.println("swap");
        heap.swap(1, 2);
    }
    /**
     * Test of poll method, of class MinHeap.
     */
    @Test
    public void testPoll() {
        System.out.println("poll");
        heap.add(new Node(1, 1));
        heap.poll();
        assertTrue("Heap is not empty, poll failed", heap.isEmpty());
    }

    /**
     * Test of isEmpty method, of class MinHeap.
     */
    @Test
    public void testIsEmpty() {
        //assertEquals(3, heap.poll().getY());
        //assertEquals(2, heap.poll().getY());
        //assertEquals(1, heap.poll().getY());
        System.out.println("isEmpty");
        assertTrue("Heap is not empty, heap is failing", heap.isEmpty());
    }
}
