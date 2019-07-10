/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package repeated.word;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void getA() {
        RepeatedWord rp = new RepeatedWord();
        assertEquals("Should return a", rp.findWord("Once upon a time, there was a brave princess who..."), "a");
    }

    @Test
    public void getIt() {
        RepeatedWord rp = new RepeatedWord();
        assertEquals("Should return it", rp.findWord("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."), "it");
    }
}
