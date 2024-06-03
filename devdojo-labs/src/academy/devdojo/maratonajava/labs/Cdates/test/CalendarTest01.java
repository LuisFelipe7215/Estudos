package academy.devdojo.maratonajava.labs.Cdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // método que instacia a classe calendar

        System.out.println(Calendar.DAY_OF_WEEK); // dia da semana
        System.out.println(Calendar.DAY_OF_MONTH); // dia do mes
        System.out.println(Calendar.DAY_OF_YEAR); // dia do ano
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH); // dia da semana no mes


        c.add(Calendar.DAY_OF_MONTH, 2);// adicionando 2 dias a mais que o tempo atual
        c.roll(Calendar.HOUR, 12); // adicionando 12 horas a mais no tempo atual, sem que mude o dia.
        Date date = c.getTime(); //  Retorna um objeto date

        System.out.println(date);
    }
}
