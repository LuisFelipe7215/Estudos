package academy.devdojo.maratonajava.labs.Cdates.test;


import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);

        Period p1 = Period.between(now, nowAfterTwoYears); // periodo de tempo de dias, no caso irá retornar anos.
        Period p2 = Period.ofDays(30); // periodo de dias
        Period p3 = Period.ofMonths(12); // periodo de meses
        Period p4 = Period.ofWeeks(58); // periodo de semanas em dias
        Period p5 = Period.ofYears(2); // periodo de anos

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(now.until(now.plusDays(p4.getDays()), ChronoUnit.MONTHS));

    }
}
