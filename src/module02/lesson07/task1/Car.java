package module02.lesson07.task1;

public abstract class Car extends  Vehicle{
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
