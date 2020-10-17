package module03.lesson02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ProgramTask23 {
    /**
     * Create an iterator that returns only even numbers.
     * The iterator must accept a list of random numbers.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt());
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}
