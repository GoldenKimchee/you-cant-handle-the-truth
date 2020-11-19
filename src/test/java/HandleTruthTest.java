import org.junit.Test;

import java.util.Set;
import java.util.TreeMap;
import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        HandleTruth.wordCount();
    }

    @Test
    public void realTest() {
        TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount();
        TreeMap<Integer, Set<String>> expected = null;
        assertEquals(expected, actual);
    }
}