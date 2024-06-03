package academy.devdojo.maratonajava.labs.Cdates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime nowMinus2Hours = LocalTime.now().minusHours(2);
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime agoraMenos2anos = LocalDateTime.now().minusYears(2);
        Duration d1 = Duration.between(now, nowMinus2Hours); // duração de tempo entre um determinado tempo e outro
        Duration d2 = Duration.between(agora, agoraMenos2anos);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(2000));
        Duration d4 = Duration.ofDays(3);
        Duration d5 = Duration.ofHours(2);
        Duration d6 = Duration.ofMinutes(120);
        Duration d7 = Duration.ofSeconds(120);
        Duration d8 = Duration.of(3, ChronoUnit.HOURS);

        // não dá para usar com LocalDate, nesse caso utiliza-se o Period.

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);
        System.out.println(d8);
    }
}
