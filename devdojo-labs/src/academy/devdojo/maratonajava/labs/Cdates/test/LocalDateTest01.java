package academy.devdojo.maratonajava.labs.Cdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date()); // toString do Date
        System.out.println(Calendar.getInstance()); // toString do Calendar
        System.out.println(Month.FEBRUARY.getValue()); // pegando o valor do mês de fevereiro
        System.out.println(Month.of(12)); // pegando o nome do mês 12
        LocalDate date = LocalDate.of(2025, 2, 11); // pegando um data específica
        LocalDate agora = LocalDate.now(); // data atual
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.lengthOfMonth()); // tamanho do mes
        System.out.println(date.lengthOfYear()); // tamanho do ano
        System.out.println(date.isLeapYear()); // se é ano bissexto ou não
        System.out.println(date.get(ChronoField.DAY_OF_WEEK)); // usando a enumeração ChronoField para pegar o dia da semana
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
        System.out.println(agora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.EPOCH);

    }
}
