package module02.lesson07.task2;

import module02.lesson07.task1.Vehicle;

public class BigGarage implements Garages{
    @Override
    public boolean enter(Vehicle vehicle) {

        return false;
    }

    @Override
    public boolean leave(Vehicle vehicle) {
        return false;
    }
}
