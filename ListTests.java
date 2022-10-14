import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListTests {
    
	// @Test 
	// public void testFilter() {
    //     String[] input1 = {"a", "b", "c"};
    //     String[] input2 = {};
    //     String[] input3 = {"apple", "banana", "yo"};
    //     String[] input4 = {"apple", "banana", "orange"};


    //     List<String> list1 = new ArrayList<>();
    //     List<String> list2 = new ArrayList<>();
    //     List<String> list3 = new ArrayList<>();
    //     List<String> list4 = new ArrayList<>();

    //     for (String str : input1) {
    //         list1.add(str);
    //     }
    //     for (String str : input2) {
    //         list2.add(str);
    //     }
    //     for (String str : input3) {
    //         list3.add(str);
    //     }
    //     for (String str : input4) {
    //         list4.add(str);
    //     }

    //     assertArrayEquals(new String[]{}, ListExamples.filter(list1, new MyStringChecker()).toArray());
    //     assertArrayEquals(new String[]{}, ListExamples.filter(list2, new MyStringChecker()).toArray());
    //     assertArrayEquals(new String[]{"apple", "banana"}, ListExamples.filter(list3, new MyStringChecker()).toArray());
    //     assertArrayEquals(new String[]{"apple", "banana", "orange"}, ListExamples.filter(list4, new MyStringChecker()).toArray());

    // }

    @Test 
	public void testMerge() {
        String[] input1a = {"a", "b"};
        String[] input1b = {"c", "d"};

        String[] input2 = {};
        String[] input3 = {"apple", "banana", "yo"};
        String[] input4 = {"apple", "banana", "orange"};


        List<String> list1a = new ArrayList<>();
        List<String> list1b = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();

        for (String str : input1a) {
            list1a.add(str);
        }
        for (String str : input1b) {
            list1b.add(str);
        }
        for (String str : input3) {
            list3.add(str);
        }
        for (String str : input4) {
            list4.add(str);
        }

        assertArrayEquals(new String[]{"a", "b", "c", "d"}, ListExamples.merge(list1a, list1b).toArray());
        // assertArrayEquals(new String[]{}, ListExamples.filter(list2, new MyStringChecker()).toArray());
        // assertArrayEquals(new String[]{"apple", "banana"}, ListExamples.filter(list3, new MyStringChecker()).toArray());
        // assertArrayEquals(new String[]{"apple", "banana", "orange"}, ListExamples.filter(list4, new MyStringChecker()).toArray());

    }


}