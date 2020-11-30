package module04.lesson04;

import java.util.Arrays;
import java.util.Collection;

/**
 * Given the collection Collection collection = Arrays.asList("1,2,0", "4,5");
 * get all numeric values that are stored comma separated in collection using flatMap
 */
public class ProgramTask43 {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("1,2,0", "4,5");
        String[] number = collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);
        System.out.println("number = " + Arrays.toString(number));
    }
}
