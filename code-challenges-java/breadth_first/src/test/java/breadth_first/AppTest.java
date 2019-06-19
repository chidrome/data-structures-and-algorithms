/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package breadth_first;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testEmptyTree(){
        Tree tree = new Tree();
        Tree fizzBuzzTree = FizzBuzz.fizzBuzz(tree, tree.root);

        assertTrue("Tree is empty or null", fizzBuzzTree.root ==null);
    }

    //check divisibles of 3, 5, and 15
    @Test
    public void testFizzBuzzValues() {
        Tree tree = new Tree();
        tree.root =  new Node(3);
        tree.root.left = new Node(15);
        tree.root.right = new Node(5);

        Tree expected = FizzBuzz.fizzBuzz(tree, tree.root);

        assertSame("Should equal Fizz", "Fizz", expected.root.data);
        assertSame("Should equal FizzBuzz", expected.root.left.data=="FizzBuzz");
        assertSame("Should equal Buzz", expected.root.right.data=="Buzz");

    }
}
