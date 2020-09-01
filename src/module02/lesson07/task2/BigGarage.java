package module02.lesson07.task2;

import module02.lesson07.task1.Vehicle;

public class BigGarage implements Garages{
    private int count = 0;

    public boolean enter(Vehicle vehicle) {
        if (count <= 1) {
            System.out.println(vehicle + " is successfully parked!");
            count++;
            return true;
        } else {
            System.out.println("There is already a vehicle in the garage!");
            return false;
        }
    }

    public boolean leave(Vehicle vehicle) {
        if (count >= 1) {
            System.out.println("The " + vehicle + " drove out of the garage!");
            count--;
            return true;
        } else {
            System.out.println("There are no vehicles in the garage!");
            return false;
        }
    }
}
