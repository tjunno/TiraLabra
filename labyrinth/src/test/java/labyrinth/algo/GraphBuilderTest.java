/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class GraphBuilderTest {
    
    public GraphBuilderTest() {
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
     * Test of GraphBuilder method, of class GraphBuilder.
     */
    @Test
    public void testGraphBuilder() {
        System.out.println("GraphBuilder");
        int x = 2;
        int y = 2;
        Node[] result = GraphBuilder.GraphBuilder(x, y);
        assertEquals(4, result.length);

    }

    /**
     * Test of addWeights method, of class GraphBuilder.
     */
    @Test
    public void testAddWeights() {
        System.out.println("addWeights");
        Node node = new Node(0,0);
        int x = 1;
        int y = 1;
        GraphBuilder instance = new GraphBuilder();
        GraphBuilder.addWeights(node, x, y);
        String expResult = "";
        assertEquals(0, 0);
        

    }
    
}
