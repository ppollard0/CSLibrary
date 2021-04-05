package cs.cscollections;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class provides methods to test the search method of the SinglyLinkedList class.
 *
 * @author  S. Sigman
 * @version 3/04/2019
 */
public class SearchTests
{
    private SinglyLinkedList<Integer> list;
    
    /**
     * Default constructor for test class SearchTests
     */
    public SearchTests()
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
        list.append(new Integer(1));
        list.append(new Integer(2));
        list.append(new Integer(3));
        list.append(new Integer(4));
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
    public void testSearch4FirstNode()
    {
        boolean found = list.search(new Integer(1));
        assertTrue("Test search for 1st node",
                   found);
    }
    
    @Test
    public void testSearch4LastNode()
    {
        boolean found = list.search(new Integer(4));
        assertTrue("Test search for 1st node",
                   found);
    }
    
    @Test
    public void testSearch4MiddleNode()
    {
        boolean found = list.search(new Integer(3));
        assertTrue("Test search for 1st node",
                   found);
    }
    
    @Test
    public void testSearch4MissingNode()
    {
        boolean found = list.search(new Integer(5));
        assertTrue("Test search for 1st node",
                   !found);
    }
}
