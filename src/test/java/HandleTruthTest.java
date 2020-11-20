import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        assertTrue(true);
    }

    @Test
    public void realTest() {
        String[] testCases = {
                "bruh",
                "hi my name is rachel and well well well idk",
                "bugs in code vs bugs in real life",
                "ha ha ha ha ha ha ho",
                "gobble gobble smack smack yum yam gobble gouble yo yum"
        };

        //expected cases______________________________________________________

        //1st case
        TreeMap<Integer, Set<String>> expect1 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set0 = new HashSet<>(Arrays.asList("bruh"));
        expect1.put(1, set0);

        //2nd case
        TreeMap<Integer, Set<String>> expect2 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set2 = new HashSet<>(Arrays.asList("hi", "idk", "rachel", "and", "name", "is", "my"));
        expect2.put(1, set2);

        Set<String> set1 = new HashSet<>(Arrays.asList("well"));
        expect2.put(3, set1);

        //3rd case
        TreeMap<Integer, Set<String>> expect3 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set4 = new HashSet<>(Arrays.asList("code", "real", "vs", "life"));
        expect3.put(1, set4);

        Set<String> set3 = new HashSet<>(Arrays.asList("bugs", "in"));
        expect3.put(2, set3);

        //4th case
        TreeMap<Integer, Set<String>> expect4 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set5 = new HashSet<>(Arrays.asList("ha"));
        expect4.put(6, set5);

        Set<String> set6 = new HashSet<>(Arrays.asList("ho"));
        expect4.put(1, set6);

        //5th case
        TreeMap<Integer, Set<String>> expect5 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set7 = new HashSet<>(Arrays.asList("gobble"));
        expect5.put(3, set7);

        Set<String> set8 = new HashSet<>(Arrays.asList("yum", "smack"));
        expect5.put(2, set8);

        Set<String> set9 = new HashSet<>(Arrays.asList("yam", "yo", "gouble"));
        expect5.put(1, set9);


        TreeMap<Integer, Set<String>>[] expectedCases = new TreeMap[5];
        expectedCases[0] = expect1;
        expectedCases[1] = expect2;
        expectedCases[2] = expect3;
        expectedCases[3] = expect4;
        expectedCases[4] = expect5;


        //end of expected cases_______________________________________________________


        for (int i = 0; i < testCases.length; i++) {
            //actual cases generated here
            TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount(testCases[i]);
            TreeMap<Integer, Set<String>> expected = expectedCases[i];
            assertEquals(actual, expected);
        }
    }
}