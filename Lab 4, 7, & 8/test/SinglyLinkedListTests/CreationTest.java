package cs.cscollections;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class provides methods to test the constructor of the SinglyLinkedList class.
 *
 * @author  S. Sigman
 * @version 3/04/2019
 */
public class CreationTest
{
    /**
     * Default constructor for test class CreationTest
     */
    public CreationTest()
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
    
    /**
     * Tests the construction of an SinglyLinkedList
     * object.
     */
    @Test
    public void testSLLCreation()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList();
        assertTrue("Creation of SLL", 
                   list.isEmpty() && list.getLength() == 0);
    }
}
