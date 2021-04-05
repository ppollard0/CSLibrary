package cs.cscollections;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * The test class InsertAfterTests.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InsertAfterTests
{
    SinglyLinkedList<Integer> list;
    SinglyLinkedList<Student> roster;
    
    /**
     * Default constructor for test class InsertAfterTests
     */
    public InsertAfterTests()
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
        roster = new SinglyLinkedList();
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
    public void testInsertAfterIntoEmptyList()
    {
        list.insertAfter(new Integer(2), new Integer(1));
        assertTrue("Test insertAfter into empty list",
                   !list.isEmpty() && list.getLength() == 1);
    }
    
    @Test
    public void testInsertAfterIntoEmptyListNullFirst()
    {
        list.insertAfter(null, new Integer(1));
        assertTrue("Test insertAfter into empty list",
                   !list.isEmpty() && list.getLength() == 1);
    }
    
    @Test
    public void testInsertAfterAtTail()
    {
        list.append(new Integer(1));
        list.insertAfter(new Integer(1), new Integer(2));
        assertTrue("Test insertAfter into list with 1 node",
                   !list.isEmpty() && list.getLength() == 2);
    }
    
    @Test
    public void testInsertAfterNBetweenNodes()
    {
        list.append(new Integer(1));
        list.append(new Integer(3));
        list.insertAfter(new Integer(1), new Integer(2));
        assertTrue("Test insertAfter in between nodes",
                   !list.isEmpty() && list.getLength() == 3);
    }
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Test
    public void testCastException()
    {
        exception.expect(ClassCastException.class);
        Student stu1 = new Student("Duck, Donald", "JR");
        Student stu2 = new Student("Duck, Daisy", "SR");
        Student stu3 = new Student("Duck, Daffy", "FR");
        roster.append(stu1);
        roster.append(stu2);
        roster.insertAfter(stu1, stu3);        
    }
}
