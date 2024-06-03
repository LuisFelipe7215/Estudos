package academy.devdojo.maratonajava.labs.Dformatacao.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brasil' d 'de' MMMM 'de' yyyy"; // definindo o padrão de formatação
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date().getTime()));

        Calendar calendar = Calendar.getInstance();
        DateFormat formatoBR = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault()); // Dateformat X SimpleDateFormat

        System.out.println("Brasil " + formatoBR.format(calendar.getTime()));
    }
}
