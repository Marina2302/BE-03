package module03.lesson06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create a Car class with fields model (String), speed (int).
 * Implement interface Comparable, which sorts by field the speed in ascending order.
 * Sort the collection of these objects. Display the result on the screen.
 * Create a Comparator for sort the objects by the models field (descending).
 * Sort the collection of these objects use Comparator. Display it.
 * Create a Comparator that will sort by model (ascending) and speed (descending).
 * Note: If model matches, then sorts by speed.
 * Example: Audi 250, Audi 210, BMW 253 ...
 */
public class Car implements Comparable<Car> {
    public String model;
    public int speed;

    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();
        list.add(new Car("Audi", 250));
        list.add(new Car("BMW", 253));
        list.add(new Car("Audi", 210));
        list.add(new Car("Ford", 270));
        list.add(new Car("BMW", 170));
        list.add(new Car("Ford", 270));
        list.add(new Car("Audi", 253));

        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println(list.toString());
        Comparator.sortCarByModelDesc(list);
        System.out.println(list.toString());
        Comparator.sortCarByModelAscAndSpeedDesc(list);
        System.out.println(list.toString());
    }

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car o) {
        if (this.speed > o.speed) {
            return 1;
        }
        if (this.speed < o.speed) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
