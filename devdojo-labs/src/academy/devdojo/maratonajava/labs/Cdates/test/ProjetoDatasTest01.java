package academy.devdojo.maratonajava.labs.Cdates.test;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class ProjetoDatasTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar data = Calendar.getInstance();
        LocalDate date = LocalDate.now();

        System.out.println("What's your language in ISO pattern?");
        String languageISO = sc.next();

        System.out.println("What's your country in ISO pattern?");
        String countryISO = sc.next();


        Locale locale = Locale.of(languageISO, countryISO);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, locale);
        System.out.println(dateFormat.format(data.getTime()));
        System.out.println(date);


    }
}
