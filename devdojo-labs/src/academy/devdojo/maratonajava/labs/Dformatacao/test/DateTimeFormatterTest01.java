package academy.devdojo.maratonajava.labs.Dformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String d1 = date.format(DateTimeFormatter.ISO_DATE);
        String d2 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String d3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        LocalDate parse1 = LocalDate.parse(d1, DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse(d2, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse3 = LocalDate.parse(d3, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate parse4 = LocalDate.parse("20240313", DateTimeFormatter.BASIC_ISO_DATE);


        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
        System.out.println(parse4);

        LocalDateTime now = LocalDateTime.now();

        String d4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(d4);

        LocalDateTime parse5 = LocalDateTime.parse("2024-03-13T10:50:21.8272792", DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(parse5);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);

        LocalDate parseBR = LocalDate.parse("13/03/2024", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterJP = DateTimeFormatter.ofPattern("yyyy.MMMM.dd", Locale.JAPAN);
        String formatJP = LocalDate.now().format(formatterJP);
        System.out.println(formatJP);
        LocalDate parseJP = LocalDate.parse(formatJP, formatterJP);
        System.out.println(parseJP);

    }
}
