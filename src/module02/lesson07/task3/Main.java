package module02.lesson07.task3;

import module02.lesson07.task1.*;
import module02.lesson07.task2.BigGarage;
import module02.lesson07.task2.Garage;
import module02.lesson07.task2.MiniGarage;

public class Main {
    public static void main(String[] args) {
        BigGarage bigGarage = new BigGarage();
        Garage garage = new Garage();
        MiniGarage miniGarage = new MiniGarage();

        Maz maz = new Maz();
        Daf daf = new Daf();
        MazdaSix mazdaSix = new MazdaSix();

        bigGarage.enter(maz);
        bigGarage.enter(new Daf());
        bigGarage.enter(new Kabus());
        bigGarage.leave(maz);
        bigGarage.leave(new Daf());
        bigGarage.leave(new Kabus());

        garage.enter(daf);
        garage.leave(daf);
        garage.enter(mazdaSix);
        garage.leave(mazdaSix);
        garage.leave(new Daf());

        miniGarage.enter(mazdaSix);
        miniGarage.enter(new FordMondeo());
        miniGarage.leave(mazdaSix);
    }
}
