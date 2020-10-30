package module03.lesson06;

import java.util.List;

public class Comparator {

    public static List<Car> sortCarByModelDesc(List<Car> cars) {
        cars.sort((o1, o2) -> o1.model.compareTo(o2.model) * (-1));
        return cars;
    }

    public static List<Car> sortCarByModelAscAndSpeedDesc(List<Car> cars) {
        cars.sort((o1, o2) -> o1.model.compareTo(o2.model) != 0 ? o1.model.compareTo(o2.model) : o1.compareTo(o2) * (-1));
        return cars;
    }
}
