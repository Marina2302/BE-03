package module03.lesson05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Create a collection of objects in which several objects will be repeated.
 * Write a method that receives a collection of objects as input and returns the collection without duplicates.
 */
public class ProgramTask53 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Hello");
        System.out.println(removeDuplicates(list));
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
