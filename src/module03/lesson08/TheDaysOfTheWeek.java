package module03.lesson08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Your task - calculate the days of the week at the end of each month of the specified year.
 * For example:
 * Map<Month, DayOfWeek> days = getDaysAtEndOfEachMonthFromYear(1945);
 * System.out.println(days);
 * Output:
 * last days in 1945 = {JANUARY=THURSDAY, FEBRUARY=THURSDAY, MARCH=SUNDAY, APRIL=TUESDAY, MAY=FRIDAY, JUNE=SUNDAY,
 * JULY=WEDNESDAY, AUGUST=SATURDAY, SEPTEMBER=MONDAY, OCTOBER=THURSDAY, NOVEMBER=SATURDAY, DECEMBER=TUESDAY}
 */
public class TheDaysOfTheWeek {
    public static void main(String[] args) {
        Map<Month, DayOfWeek> days = getDaysAtEndOfEachMonthFromYear(1945);
        System.out.println("Last days in 1945 = " + days);
    }

    private static Map<Month, DayOfWeek> getDaysAtEndOfEachMonthFromYear(int i) {
        Map<Month, DayOfWeek> days = new LinkedHashMap<>();
        for (Month month : Month.values()) {
            DayOfWeek dayOfWeek = LocalDate.now()
                    .withMonth(month.getValue())
                    .withYear(1945)
                    .with(TemporalAdjusters.lastDayOfMonth())
                    .getDayOfWeek();
            days.put(month, dayOfWeek);
        }
        return days;
    }
}
