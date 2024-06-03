package academy.devdojo.maratonajava.labs.Dformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale localeUS = Locale.US;
        Locale localeBR = Locale.getDefault();

        NumberFormat formatoAmericano = NumberFormat.getInstance(localeUS);
        NumberFormat formatoBR = NumberFormat.getInstance(localeBR);

        NumberFormat moedaUSA = NumberFormat.getCurrencyInstance(localeUS);


        System.out.println("Digite o número que você deseja converter para o padrão US");
        double num = sc.nextDouble();

        System.out.println("Número antes de ser formatado: " + formatoBR.format(num));

        System.out.println("Número após ser formatado: " + formatoAmericano.format(num));

        String moeda = "$";
        moeda += Double.toString(num);


        try {
            System.out.println(moedaUSA.parse(moeda));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
