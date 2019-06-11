package queue_with_stacks;

import java.util.Stack;

public class PseudoQueue {
    //define stacks
    protected Stack inputStack;
    protected Stack outputStack;

    //create constructor
    public PseudoQueue(){
        inputStack = new Stack();
        outputStack = new Stack();
    }

    public void enQueue(int value){
        //add to the input stack
        inputStack.push(value);
    }

    public int deQueue(){
        int result = -1;
        if(inputStack != null) {
            copyStack(inputStack, outputStack);

            result = (int) outputStack.pop();

            copyStack(outputStack, inputStack);
        }
        return result;
    }

    // Helper method to copy stack
    private void copyStack(Stack from, Stack to){
        int value;
        while(from.peek() != null){
            value = (int) from.pop();
            to.push(value);
        }
    }
}

