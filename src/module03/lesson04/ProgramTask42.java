package module03.lesson04;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Create a PriorityQueue of five different numbers.
 * Create a comparator that compares the numbers.
 * Print out the numbers in ascending order.
 */
public class ProgramTask42 {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new IntComparator();
        PriorityQueue<Integer> queue = new PriorityQueue<>(5, comparator);
        queue.add(1);
        queue.add(4);
        queue.add(2);
        queue.add(5);
        queue.add(3);

        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }
    }
}

class IntComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return -1;
        }
        if (o1 > o2) {
            return 1;
        }
        return 0;
    }
}
