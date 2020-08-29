package module02.lesson06;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static House[] houses = {
            new House(1, 1, 18, 1, 1, "Old", "Old", 10),
            new House(2, 24, 2, 2, "New"),
            new House(3, 20, 1, 1, "New"),
            new House(4, 40, 3, 2, "New"),
            new House(5, 50, 2, 3, "Old"),
            new House(6, 18, 5, 1, "Old")};

    public static void main(String[] args) throws IOException {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            showMenu();
            int res = sc.nextInt();
            if (res == 4) break;
            if (res > 0 && res < 4) {
                sort(res);
            } else {
                System.out.println("There is no such option! Choose from the options provided!");
            }
        }
    }

    private static void sort(int res) {
        switch (res) {
            case 1:
                House.sortByNumberOfRooms(houses);
                break;
            case 2:
                House.sortByNumberOfRoomsAndFloor(houses);
                break;
            case 3:
                House.sortByArea(houses);
                break;
        }
    }

    private static void showMenu() {
        System.out.println(
                "Select the option you want:\n 1. Show the list of apartments with a given number of rooms\n " +
                        "2. Show the list of apartments with a given number of rooms and located on a floor that is in a given interval\n " +
                        "3. Show the list of apartments with an area exceeding the specified one\n 4. Exit");
    }
}
