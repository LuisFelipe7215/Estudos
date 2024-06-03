package academy.devdojo.maratonajava.labs.Cdates.test;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class ZoneProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Digite o nome da zona que deseja saber");
        String nomeZona = sc.next();

        ZoneId zona = ZoneId.of(nomeZona);
        System.out.println(zona.getDisplayName(TextStyle.FULL, Locale.getDefault()));

        Instant zuluTimeNow = Instant.now();
        ZonedDateTime zuluTimeComZona = zuluTimeNow.atZone(zona);
        System.out.println("Data formatada para a zona: " + zuluTimeComZona);

        System.out.println("Entre com o horário para definir a zona");
        String horarioZona = sc.next();

        ZoneOffset horario = ZoneOffset.of(horarioZona);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(now, horario);
        System.out.println("Horário definido: " + offsetDateTime);

        OffsetDateTime offsetDateTime1 = zuluTimeNow.atOffset(horario);
        System.out.println(offsetDateTime1);


    }
}
