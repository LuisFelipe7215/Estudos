package academy.devdojo.maratonajava.labs.Cdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1962, Month.APRIL, 14, 11, 59,34);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.HOURS.between(aniversario, now));
        System.out.println(ChronoUnit.DECADES.between(aniversario, now));
        System.out.println(ChronoUnit.CENTURIES.between(aniversario, now));
        System.out.println(ChronoUnit.SECONDS.between(aniversario, now));
        System.out.println(ChronoUnit.MINUTES.between(aniversario, now));
    }
}
