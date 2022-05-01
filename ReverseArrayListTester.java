/**
 * Tests to check the implementation of reverseRegion method in MyArrayList.java
*/

//other import statements

import static org.junit.Assert.*;
import org.junit.*;

//IMPORTANT: DO NOT MODIFY THE TEST HEADERS!
/**
 * This class contains various test cases to test the reverseRegion method
 */
public class ReverseArrayListTester {

    Integer[] arrayInts = {0,1,2,3,4};
    private MyArrayList myList;

    /**
     * Run before every test
     */
    @Before
    public void setUp(){
        myList = new MyArrayList<Integer>(arrayInts);
    }

    /**
     * Tests reverseRegion method when either fromIndex or toIndex
     * or both are out of bounds.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReverseIndexOutOfBounds(){
        myList.reverseRegion(0, 9);
    }

    /**
     * Tests reverseRegion method when
     * fromIndex > toIndex
     */
    @Test
    public void testReverseFromIndexGreater(){
        myList.reverseRegion(3,1);
        assertEquals(1, myList.get(0));
        assertEquals(2, myList.get(1));
        assertEquals(3, myList.get(2));
        assertEquals(4, myList.get(3));
        assertEquals(5, myList.get(4));

    }

    /**
     * Tests reverseRegion method when
     * fromIndex and toIndex are within bounds and
     * in the middle of the list 
     * (i.e. fromIndex > 0 and toIndex < size-1), 
     * and fromIndex is less than toIndex.
    */
    @Test
    public void testReverseIndexWithinBounds(){

        myList.reverseRegion(1,3);
        assertEquals(1, myList.get(0));
        assertEquals(4, myList.get(1));
        assertEquals(3, myList.get(2));
        assertEquals(2, myList.get(3));
        assertEquals(5, myList.get(4));

    }

    /**
     * Tests reverseRegion method when fromIndex and 
     * toIndex are equal
     * 
     * other test that is similar tested only when fromIndex
     * is strictly greater than toIndex
    */
    @Test
    public void testReverseCustom(){
        myList.reverseRegion(3,3);
        assertEquals(1, myList.get(0));
        assertEquals(2, myList.get(1));
        assertEquals(3, myList.get(2));
        assertEquals(4, myList.get(3));
        assertEquals(5, myList.get(4));

    }
}
