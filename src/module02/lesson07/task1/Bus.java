package module02.lesson07.task1;

public abstract class Bus extends Vehicle {
    private int numberSeats;

    public Bus() {
    }

    public Bus(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public int getNumberSeats() {
        return numberSeats;
    }
}
