package academy.devdojo.maratonajava.labs.Cdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now(); // data e hora atual
        System.out.println(ldt);

        LocalDate date = LocalDate.of(2077, 2, 11);
        LocalTime time = LocalTime.of(10, 23,21);

        LocalDateTime ldt1 = date.atTime(time); // juntando a data com o tempo
        LocalDateTime ldt2 = time.atDate(date);

        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
