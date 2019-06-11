package queue_with_stacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue() {
        PseudoQueue test = new PseudoQueue();
        test.enqueue(3);

        assertEquals("Top value should be the newest value.", 3, test.inputStack.peek());
        test.enqueue(1);
        test.enqueue(24);
        assertEquals("Top value should be the newest value.", 24, test.inputStack.peek());
    }

    @Test
    public void dequeue() {
        PseudoQueue test = new PseudoQueue();
        test.enqueue(3);
        test.enqueue(24);
        test.enqueue(39);
        assertEquals("Should return the oldest value.", 3, test.dequeue());

    }

}