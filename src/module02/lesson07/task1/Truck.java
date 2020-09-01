package module02.lesson07.task1;

public abstract class Truck extends Vehicle {
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
