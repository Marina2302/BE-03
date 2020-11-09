package module03.lesson08;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Implement a method that takes 2 different years as input. This method should select the year with the most
 * Fridays 13 in the range between 1 year and the second (if years more than 1 - select the earliest).
 * Exapmle:
 * int year = getJasonVoorheesDay(1900, 2020);
 * System.out.println("The most bloodiest year = " + year);
 */
public class Friday13 {
    public static void main(String[] args) {
        int year = getJasonVoorheesDay(1900, 2020);
        System.out.println("The most bloodiest year = " + year);
    }

    private static int getJasonVoorheesDay(int i, int i1) {
        int fridays1 = 0;
        int fridays2 = 0;
        int blYear = i;
        for (int k = i; k <= i1; k++) {
            for (int j = 1; j <= 12; j++) {
                LocalDate year = LocalDate.of(k, j, 13);
                if (k == i && year.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                    fridays1++;
                } else if (year.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                    fridays2++;
                }
            }
            if (fridays2 > fridays1) {
                fridays1 = fridays2;
                blYear = k;
            }
            fridays2 = 0;
        }
        return blYear;
    }
}
