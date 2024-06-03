package academy.devdojo.maratonajava.labs.Cdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1709819639771L);// aceita um valor em milissegundos no parâmetro de seu construtor.
        System.out.println(date); // imprimi a data.
        date.setTime(date.getTime() + 3_000_000); // adiciona um valor para a data em millisegundos
        System.out.println(date);
    }
}
