package module02.lesson07.task2;

public class Garage implements Garages{
    private int count = 0;

    public boolean enter(Garages garages) {
        if (count <= 0) {
            System.out.println("The " + garages + " is successfully parked!");
            count++;
            return true;
        } else {
            System.out.println("There is already a car in the garage!");
            return false;
        }
    }

    public boolean leave(Garages garages) {
        if (count >= 1) {
            System.out.println("The " + garages + " drove out of the garage!");
            count--;
            return true;
        } else {
            System.out.println("There are no cars in the garage!");
            return false;
        }
    }
}
