package module02.lesson07.task2;

import module02.lesson07.task1.Car;

public class MiniGarage {
    private int count = 0;

    public boolean enter(Car car) {
        if (count <= 0) {
            System.out.println("The " + car + "is successfully parked!");
            count++;
            return true;
        } else {
            System.out.println("There is already a car in the garage!");
            return false;
        }
    }

    public boolean leave(Car car) {
        if (count >= 1) {
            System.out.println("The " + car + " drove out of the garage!");
            count--;
            return true;
        } else {
            System.out.println("There are no cars in the garage!");
            return false;
        }
    }
}
