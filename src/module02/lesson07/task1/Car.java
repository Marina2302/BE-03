package module02.lesson07.task1;

import module02.lesson07.task2.Garages;

public abstract class Car extends Vehicle implements Garages {
    private int maxSpeed;

    public Car() {
    }

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
