package academy.devdojo.maratonajava.labs.Cdates.test;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant zuluTime = Instant.now(); // horário em zulu time
        System.out.println(zuluTime);
        System.out.println(zuluTime.getEpochSecond());
        System.out.println(zuluTime.getNano());
        System.out.println(Instant.ofEpochSecond(3));
    }
}
