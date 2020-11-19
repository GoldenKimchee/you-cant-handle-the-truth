import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        String[] examples = {
                "",
                "hi my name is rachel and well well well idk",
                "bugs in code vs bugs in real life",
                "ha ha ha ha ha ha ho",
                "gobble gobble smack smack yum yam gobble gouble yo yum"
        };

        for (String sentence: examples) {
            TreeMap<Integer, Set<String>> returned = HandleTruth.wordCount(sentence);
            System.out.println(returned);
            System.out.println(returned.get(8));
        }
    }

    @Test
    public void realTest() {
        String[] examples = {
                "",
                "hi my name is rachel and well well well idk",
                "bugs in code vs bugs in real life",
                "ha ha ha ha ha ha ho",
                "gobble gobble smack smack yum yam gobble gouble yo yum"
        };

        //actual cases______________________________________________________

        //1st case
        TreeMap<Integer, Set<String>> expect1 = new TreeMap<>();

        //2nd case
        TreeMap<Integer, Set<String>> expect2 = new TreeMap<>();

        Set<String> set1 = new HashSet<>();
        set1.add("well");
        expect2.put(3, set1);

        Set<String> set2 = new HashSet<>();
        set2.add("hi, idk, rachel, and, name, is, my");
        expect1.put(1, set2);


        //3rd case
        TreeMap<Integer, Set<String>> expect3 = new TreeMap<>();

        Set<String> set3 = new HashSet<>();
        set3.add("bugs, in");
        expect3.put(2, set3);

        Set<String> set4 = new HashSet<>();
        set4.add("code, real, vs, life");
        expect3.put(2, set4);

        //4th case
        TreeMap<Integer, Set<String>> expect4 = new TreeMap<>();

        Set<String> set5 = new HashSet<>();
        set5.add("ha");
        expect4.put(6, set5);

        Set<String> set6 = new HashSet<>();
        set6.add("ho");
        expect4.put(1, set6);

        //5th case
        TreeMap<Integer, Set<String>> expect5 = new TreeMap<>();

        Set<String> set7 = new HashSet<>();
        set7.add("gobble");
        expect5.put(3, set7);

        Set<String> set8 = new HashSet<>();
        set8.add("yum, smack");
        expect5.put(2, set8);

        Set<String> set9 = new HashSet<>();
        set9.add("yam, yo, gouble");
        expect5.put(1, set9);


        TreeMap<Integer, Set<String>>[] actualCases = new TreeMap[5];
        actualCases[0] = expect1;
        actualCases[1] = expect2;
        actualCases[2] = expect3;
        actualCases[3] = expect4;
        actualCases[4] = expect5;


        //end of actual cases_______________________________________________________


        for (int i = 0; i < actualCases.length; i++) {
            TreeMap<Integer, Set<String>> returned = HandleTruth.wordCount(sentence);
            TreeMap<Integer, Set<String>> actual = actualCases[i];
            System.out.println(returned);
            System.out.println(returned.get(8));
        }

        TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount("");
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