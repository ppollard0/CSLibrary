
package cs.cscollections;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class provides to test the append method of the SinglyLinkedList class.
 *
 * @author  S. Sigman
 * @version 3/04/2019
 */
public class AppendTest
{
    private SinglyLinkedList<Integer> list;
    
    /**
     * Default constructor for test class AppendTest
     */
    public AppendTest()
    {

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        list = new SinglyLinkedList();        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testAppend1Node()
    {
        list.append(new Integer(1));
        assertTrue("Test Appending One Node",
                    !list.isEmpty() && list.getLength() == 1);
    }
    
    @Test
    public void testAppend2Node()
    {
        list.append(new Integer(1));
        list.append(new Integer(2));
        assertTrue("Test Appending Two Nodes",
                   !list.isEmpty() && list.getLength() ==2);
    }
}
