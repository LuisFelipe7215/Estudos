package academy.devdojo.maratonajava.labs.Cdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class ExercicioDiaUtil {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        now = now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));

        switch (now.getDayOfWeek()) {
            case FRIDAY:
                now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
                break;
            case SATURDAY:
                now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
                break;
            case SUNDAY:
                now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
                break;
            default: now.plusDays(1);
        }

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}
