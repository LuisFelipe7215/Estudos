package academy.devdojo.maratonajava.labs.Dformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];

        df[0] = DateFormat.getInstance(); // data de acordo com o sistema 07/03/2024 11:35
        df[1] = DateFormat.getDateInstance(); // data "7 de mar. de 2024"
        df[2] = DateFormat.getDateTimeInstance(); // data com o tempo "7 de mar. de 2024 11:35:12"
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); // data com formato curto  07/03/2024
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); // data com formato medio 7 de mar. de 2024
        df[5] = DateFormat.getDateInstance(DateFormat.LONG); // data com formato longo  7 de março de 2024
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); // data com o dia da semana quinta-feira, 7 de março de 2024

        for (DateFormat dateFormat : df){
            System.out.println(dateFormat.format(calendar.getTime())); // formata a data e pede um objeto date como parâmetro.
        }
    }
}
