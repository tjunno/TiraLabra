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
 * @author tjunno
 */
public class DCompTest {
    
    public DCompTest() {
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
     * Test of compare method, of class DComp.
     */
  
    @Test
    public void test(){
        
    }
    /*
    public void testCompare() {
        System.out.println("compare");
        Weight o1 = new Weight(1, 1);
        Weight o2 = new Weight(2, 2);
        DComp instance = new DComp();
        int expResult = 0;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    */

    /**
     * Test of compare method, of class DComp.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Weight o1 = new Weight(1, 1);
        Weight o2 = new Weight(1, 1);;
        DComp instance = new DComp();
        int expResult = 0;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
    }
}
