package academy.devdojo.maratonajava.labs.Fregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d - tudo que for digito
        // \D - tudo que não for \d
        // \s - tudo que for espaço em branco
        // \S - tudo que não for \s
        // \w - a-z,A-Z, digitos, _
        // \W - tudo que não for \w
        String regex = "\\W"; // expressão a ser encontrada
        String texto = "12e_d21?!ewm 2"; // o texto em que será buscada a expressão
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
