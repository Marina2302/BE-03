package module04.lesson04;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given the collection Collection collection = Arrays.asList("a1", "a2", "a3", "a1");
 * Return two items starting with the second
 * Return the last element of the collection
 */
public class ProgramTask1 {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        List<String> fromTo = collection.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println("fromTo = " + fromTo);
    }
}
