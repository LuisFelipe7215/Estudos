package academy.devdojo.maratonajava.labs.Cdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now(); // tempo atual
        System.out.println(time); // toString do LocalTime
        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
        System.out.println(time.withNano(0)); // remove o nanosegundo
        System.out.println(time.get(ChronoField.SECOND_OF_DAY));
        System.out.println(time.get(ChronoField.MINUTE_OF_DAY));
        System.out.println(time.minusHours(9).withNano(0));

    }
}
