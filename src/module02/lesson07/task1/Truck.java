package module02.lesson07.task1;

import module02.lesson07.task2.Garages;

public abstract class Truck extends Vehicle implements Garages {
    private int maxWeight;

    public Truck() {
    }

    public Truck(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
