/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked_list;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    private Library testList;
    @Before
    public void init() {
        testList = new Library();
    }


    @Test
    public void emptyInitiatedList() {
        assertNull("Empty linked list head should be null", testList.head);
    }

    @Test
    public void insertOneIntoNewList() {
        testList.insert(1);
        assertTrue("Value of 1 is in list", testList.includes(1));
        assertFalse("2 is not in list", testList.includes(2));
    }

    @Test
    public void insertThreeValue() {
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);

        assertEquals("ArrayList should return three", "[1, 2, 3]", result.toString());
    }

    @Test
    public void returnEmptyList() {
        assertEquals("Empty list", "[]", testList.print().toString());
    }

    @Test
    public void testInsertBeforeFirstNode(){
        emptyInitiatedList();
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(3);
        testList.insertBefore(3, 2);
        System.out.println(result);

    }
}
