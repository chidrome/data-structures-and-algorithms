/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stacks_and_queues;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test(expected = NullPointerException.class)
    public void stack_testStackConstructor(){
        Stack stack = new Stack();
        stack.peek();
    }

    @Test
    public void stack_testPushOneIntoStack(){
        Stack stack = new Stack();

        stack.push(4);
        assertEquals("Should return 4", 4, stack.peek());
    }
}
