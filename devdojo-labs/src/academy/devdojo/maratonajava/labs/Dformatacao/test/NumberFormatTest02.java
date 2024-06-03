package academy.devdojo.maratonajava.labs.Dformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR"); // definindo o local para pt br
        Locale localeJP = Locale.JAPAN; // definindo o local para o jp
        Locale localeUSA = Locale.US; // definindo o local para o US
        Locale localeItaly = Locale.ITALY; // definindo o locaL para italy
        Locale localeChina = Locale.CHINA;

        NumberFormat[] nf = new NumberFormat[5];
        nf[0] = NumberFormat.getCurrencyInstance(localePT); // formatando o numeros de acordo com a moeda local
        nf[1] = NumberFormat.getCurrencyInstance(localeJP);
        nf[2] = NumberFormat.getCurrencyInstance(localeUSA);
        nf[3] = NumberFormat.getCurrencyInstance(localeItaly);
        nf[4] = NumberFormat.getCurrencyInstance(localeChina);

        double number = 1_000_000.20;

        for (NumberFormat numberFormat : nf){
            System.out.println(numberFormat.format(number)); // formatando
        }

        String valorString = "￥1,000,000";

        try {
            System.out.println(nf[1].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
