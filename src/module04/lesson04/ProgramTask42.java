package module04.lesson04;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a collection of strings Arrays.asList(«a1», «a4», «a3», «a2», «a1», «a4»);
 * Sort values alphabetically
 * Sort values alphabetically in reverse order and remove duplicates
 */
public class ProgramTask42 {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");

        List<String> sorted = collection.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted = " + sorted);
    }
}
