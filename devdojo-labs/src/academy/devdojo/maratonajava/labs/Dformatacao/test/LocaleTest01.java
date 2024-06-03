package academy.devdojo.maratonajava.labs.Dformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeJapan = new Locale("ja", "´JP");
        Locale localeTailand = new Locale("th", "TH");
        Locale localeUS = new Locale("en", "US");
        Locale localeIndia = new Locale("HI", "in");
        Locale localeBrasil = new Locale("pt", "BR");

        Calendar calendar = Calendar.getInstance();
        DateFormat japan = DateFormat.getDateInstance(DateFormat.LONG, localeJapan);
        DateFormat thailand = DateFormat.getDateInstance(DateFormat.LONG, localeTailand);
        DateFormat unitedStates = DateFormat.getDateInstance(DateFormat.LONG, localeUS);
        DateFormat india = DateFormat.getDateInstance(DateFormat.LONG, localeIndia);
        DateFormat brasil = DateFormat.getDateInstance(DateFormat.LONG, localeBrasil);

        System.out.println("Japão " + japan.format(calendar.getTime())); // data formatado para o japão
        System.out.println("Tailândia " + thailand.format(calendar.getTime())); // data formatado para a tailândia
        System.out.println("Estados Unidos " + unitedStates.format(calendar.getTime())); // data formatado para o EUA
        System.out.println("India " + india.format(calendar.getTime())); // data formatado para a india
        System.out.println("Brasil " + brasil.format(calendar.getTime())); // data formatado para o brasil

        System.out.println(Locale.JAPAN.getDisplayLanguage(localeJapan));
        System.out.println(Locale.US.getDisplayLanguage(localeUS));
        System.out.println(Locale.CHINA.getDisplayLanguage(localeUS));

    }
}
