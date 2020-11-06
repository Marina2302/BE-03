package module03.lesson08;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Implement a method that takes 2 different years as input. This method should select the year with the most Fridays 13.
 * Exapmle:
 * int year = getJasonVoorheesDay(1900, 2020);
 * System.out.println("The most bloodiest year = " + year);
 */
public class Friday13 {
    public static void main(String[] args) {
        int year = getJasonVoorheesDay(1998, 2020);
        System.out.println("The most bloodiest year = " + year);
    }

    private static int getJasonVoorheesDay(int i, int i1) {
        int fridays1 = 0;
        int fridays2 = 0;
        for (int j = 1; j <= 12; j++) {
            LocalDate firstYear = LocalDate.of(i, j, 13);
            LocalDate secondYear = LocalDate.of(i1, j, 13);
            if (firstYear.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                fridays1++;
            }
            if (secondYear.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                fridays2++;
            }
        }
        return fridays1 > fridays2 ? i : i1;
    }
}
