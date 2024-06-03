package academy.devdojo.maratonajava.labs.Cdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS; // pegando todos os zones ids
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault()); // pegando o zone id padrão do sistema

        ZoneId hochiminhZone = ZoneId.of("Asia/Ho_Chi_Minh"); //pegando um zoneid especifico
        System.out.println(hochiminhZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(hochiminhZone); // atribuindo a zona ao LocalDateTime, mas não altera o horário
        System.out.println(zonedDateTime);

        Instant zuluTime = Instant.now(); // zulu time
        System.out.println(zuluTime);
        ZonedDateTime zonedDateTime1 = zuluTime.atZone(hochiminhZone); // atribuindo a zona ao zuluTime alterando o hórario de acordo com ela.
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX); // máximo de valor que pode atribuir a uma zona
        System.out.println(ZoneOffset.MIN); // mímimo de valor que pode atribuir a uma zona

        ZoneOffset offsetBrasilia = ZoneOffset.of("+03:00"); // setando um zona personalizada
        OffsetDateTime brasilia = now.atOffset(offsetBrasilia); // guardando a zona em um objeto do tipo OffsetDateTime
        System.out.println(brasilia);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(now, offsetBrasilia);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = zuluTime.atOffset(offsetBrasilia);
        System.out.println(offsetDateTime1);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        LocalDate brasiliaBirth = LocalDate.of(1960, Month.APRIL, 21);
        JapaneseDate japaneseEra = JapaneseDate.from(brasiliaBirth);
        System.out.println(japaneseEra);
    }
}
