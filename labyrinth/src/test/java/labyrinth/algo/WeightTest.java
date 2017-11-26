/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth.algo;
import java.util.*;
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
public class WeightTest {
    
    public WeightTest() {
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
     * Test of getI method, of class Weight.
     */
    @Test
    public void testGetIGetW() {
        ArrayList<Weight> list = new ArrayList<>();
        for (int i=1; i<10; i++){
            list.add(new Weight(i, i*10));
        }
        for (int i=1; i<10; i++){
            System.out.println("getI");
            assertTrue(list.get(i).getI() == i);
            System.out.println("getW");
            assertTrue(list.get(i).getW() == i*10);
        }
    }
}
