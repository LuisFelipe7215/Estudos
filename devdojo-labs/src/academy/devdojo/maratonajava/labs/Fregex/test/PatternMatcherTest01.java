package academy.devdojo.maratonajava.labs.Fregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "xbox"; // expressão a ser encontrada
        String texto = "xboxpspxboxpspxpspbox"; // o texto em que será buscada a expressão
        Pattern pattern = Pattern.compile(regex); // O padrão sendo compilado
        Matcher matcher = pattern.matcher(texto); // onde o padrão será encontrado

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }


    }
}
