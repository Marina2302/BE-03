package module03.lesson02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProgramTask21 {
    /**
     * Measure the time of adding, searching and removing elements from LinkedList and ArrayList.
     * Compare the time and conclude in what conditions which collection works faster.
     */
    public static void main(String[] args) {
        List linkedList = new LinkedList<>();
        List arrayList = new ArrayList();

        long startTime = System.nanoTime();
        linkedList.add("Hello World!");
        linkedList.add("This is JAVA!");
        linkedList.add("test");
        linkedList.add("Hello");
        linkedList.add("Bye");
        long endTime = System.nanoTime();
        System.out.println("Total execution time for linkedList method add: " + (endTime - startTime) + "ns");

        long startTime1 = System.nanoTime();
        arrayList.add("Hello World!");
        arrayList.add("This is JAVA!");
        arrayList.add("test");
        arrayList.add("Hello");
        arrayList.add("Bye");
        long endTime1 = System.nanoTime();
        System.out.println("Total execution time for arrayList method add: " + (endTime1 - startTime1) + "ns");
        System.out.println("-----------------");

        long startTime01 = System.nanoTime();
        linkedList.add(0, "first");
        long endTime01 = System.nanoTime();
        System.out.println("Total execution time for linkedList method add by first index: " + (endTime01 - startTime01) + "ns");

        long startTime02 = System.nanoTime();
        arrayList.add(0, "first");
        long endTime02 = System.nanoTime();
        System.out.println("Total execution time for arrayList method add by first index: " + (endTime02 - startTime02) + "ns");
        System.out.println("-----------------");

        long startTime010 = System.nanoTime();
        linkedList.add(3, "first");
        long endTime010 = System.nanoTime();
        System.out.println("Total execution time for linkedList method add by index: " + (endTime010 - startTime010) + "ns");

        long startTime020 = System.nanoTime();
        arrayList.add(3, "first");
        long endTime020 = System.nanoTime();
        System.out.println("Total execution time for arrayList method add by index: " + (endTime020 - startTime020) + "ns");
        System.out.println("-----------------");

        long startTime2 = System.nanoTime();
        linkedList.indexOf("test");
        long endTime2 = System.nanoTime();
        System.out.println("Total execution time for linkedList method indexOf: " + (endTime2 - startTime2) + "ns");

        long startTime3 = System.nanoTime();
        arrayList.indexOf("test");
        long endTime3 = System.nanoTime();
        System.out.println("Total execution time for arrayList method indexOf: " + (endTime3 - startTime3) + "ns");
        System.out.println("-----------------");

        long startTime4 = System.nanoTime();
        linkedList.get(4);
        long endTime4 = System.nanoTime();
        System.out.println("Total execution time for linkedList method get: " + (endTime4 - startTime4) + "ns");

        long startTime5 = System.nanoTime();
        arrayList.get(4);
        long endTime5 = System.nanoTime();
        System.out.println("Total execution time for arrayList method get: " + (endTime5 - startTime5) + "ns");
        System.out.println("-----------------");

        long startTime04 = System.nanoTime();
        linkedList.get(0);
        long endTime04 = System.nanoTime();
        System.out.println("Total execution time for linkedList method get by first index: " + (endTime04 - startTime04) + "ns");

        long startTime05 = System.nanoTime();
        arrayList.get(0);
        long endTime05 = System.nanoTime();
        System.out.println("Total execution time for arrayList method get by first index: " + (endTime05 - startTime05) + "ns");
        System.out.println("-----------------");

        long startTime040 = System.nanoTime();
        linkedList.get(linkedList.size() - 1);
        long endTime040 = System.nanoTime();
        System.out.println("Total execution time for linkedList method get by last index: " + (endTime040 - startTime040) + "ns");

        long startTime050 = System.nanoTime();
        arrayList.get(arrayList.size() - 1);
        long endTime050 = System.nanoTime();
        System.out.println("Total execution time for arrayList method get by last index: " + (endTime050 - startTime050) + "ns");
        System.out.println("-----------------");

        long startTime6 = System.nanoTime();
        linkedList.remove("test");
        long endTime6 = System.nanoTime();
        System.out.println("Total execution time for linkedList method remove by object: " + (endTime6 - startTime6) + "ns");

        long startTime7 = System.nanoTime();
        arrayList.remove("test");
        long endTime7 = System.nanoTime();
        System.out.println("Total execution time for arrayList method remove by object: " + (endTime7 - startTime7) + "ns");
        System.out.println("-----------------");

        long startTime8 = System.nanoTime();
        linkedList.remove(3);
        long endTime8 = System.nanoTime();
        System.out.println("Total execution time for linkedList method remove by index: " + (endTime8 - startTime8) + "ns");

        long startTime9 = System.nanoTime();
        arrayList.remove(3);
        long endTime9 = System.nanoTime();
        System.out.println("Total execution time for arrayList method remove by index: " + (endTime9 - startTime9) + "ns");
        System.out.println("-----------------");

        long startTime10 = System.nanoTime();
        linkedList.remove(0);
        long endTime10 = System.nanoTime();
        System.out.println("Total execution time for linkedList method remove by first index: " + (endTime10 - startTime10) + "ns");

        long startTime11 = System.nanoTime();
        arrayList.remove(0);
        long endTime11 = System.nanoTime();
        System.out.println("Total execution time for arrayList method remove by first index: " + (endTime11 - startTime11) + "ns");
        System.out.println("-----------------");

        long startTime12 = System.nanoTime();
        linkedList.remove(linkedList.size() - 1);
        long endTime12 = System.nanoTime();
        System.out.println("Total execution time for linkedList method remove by last index: " + (endTime12 - startTime12) + "ns");

        long startTime13 = System.nanoTime();
        arrayList.remove(arrayList.size() - 1);
        long endTime13 = System.nanoTime();
        System.out.println("Total execution time for arrayList method remove by last index: " + (endTime13 - startTime13) + "ns");
    }
}
