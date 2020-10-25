package module03.lesson04;

import java.util.LinkedList;
import java.util.Queue;

public class ProgramTask41 {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.add(new Person((int) (Math.random() * 100) / 10));
        }
        System.out.println(queue.toString());
        for (int j = 0; j < 10; j++) {
            if (queue.element().getNum() > 5) {
                queue.add(queue.element());
                queue.remove();
            } else {
                queue.remove();
            }
        }
        System.out.println(queue.toString());
    }
}

class Person {
    private int num;

    public Person(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Person{" +
                "num=" + num +
                '}';
    }
}
