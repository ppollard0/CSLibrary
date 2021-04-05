package cs.cscollections;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class provides methods to test the prependTest method of the SinglyLinkedListClass.
 *
 * @author  S. Sigman
 * @version 3/04/2019
 */
public class PrependTest
{
    private SinglyLinkedList<Integer> list;
    
    /**
     * Default constructor for test class PrependTest
     */
    public PrependTest()
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
    public void testPrepend1Node()
    {
        list.prepend(new Integer(2));
        assertTrue("Test prepend of single node",
                   !list.isEmpty() && list.getLength() == 1);
    }
    
    @Test
    public void testPrepend2Nodes()
    {
        list.prepend(new Integer(2));
        list.prepend(new Integer(1));
        assertTrue("Test prepend of single node",
                   !list.isEmpty() && list.getLength() == 2);
    }
}
