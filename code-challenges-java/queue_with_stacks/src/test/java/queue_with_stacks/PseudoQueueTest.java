package queue_with_stacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue() {
        PseudoQueue test = new PseudoQueue();
        test.enQueue(3);

        assertEquals("Top value should be the newest value.", 3, test.inputStack.peek());
        test.enQueue(1);
        test.enQueue(24);
        assertEquals("Top value should be the newest value.", 24, test.inputStack.peek());
    }

    @Test
    public void dequeue() {
        PseudoQueue test = new PseudoQueue();
        test.enQueue(3);
        test.enQueue(24);
        test.enQueue(39);
        assertEquals("Should return the oldest value.", 3, test.deQueue());

    }

}