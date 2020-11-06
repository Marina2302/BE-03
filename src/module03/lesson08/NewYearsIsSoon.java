package module03.lesson08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Count and log all remaining days to the end of the current year. Output example (if we started since 28 December):
 * December 28 December 29 December 30 December 31
 * Remaining 4 days!
 */
public class NewYearsIsSoon {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2020, 12, 31);
        long until = LocalDate.now().until(newYear, ChronoUnit.DAYS);
        for (int i = 0; i <= until; i++) {
            System.out.println(LocalDate.now().plusDays(i).format(DateTimeFormatter.ofPattern("MMMM dd")));
        }
        System.out.println("Remaining " + until + " days!");
    }
}
