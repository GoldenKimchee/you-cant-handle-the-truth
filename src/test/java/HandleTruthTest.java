import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        TreeMap<Integer, Set<String>> returned = HandleTruth.wordCount();
        System.out.println(returned);
        System.out.println(returned.get(8));
    }

    @Test
    public void realTest() {
        TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount();
        List<String[]> actualList = new ArrayList<>();

        for (int i = 0; i < actual.size(); i++) {
            Set<String> set = actual.get(i);
            int length = set.size();
            String[] array = set.toArray(new String[length]);
            actualList.add(array);
        }

        TreeMap<Integer, Set<String>> expected = null;
        assertEquals(expected, actual);

    }
}