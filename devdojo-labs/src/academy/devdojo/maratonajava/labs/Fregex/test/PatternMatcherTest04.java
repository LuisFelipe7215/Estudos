package academy.devdojo.maratonajava.labs.Fregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d - tudo que for digito
        // \D - tudo que não for \d
        // \s - tudo que for espaço em branco
        // \S - tudo que não for \s
        // \w - a-z,A-Z, digitos, _
        // \W - tudo que não for \w
        // [] - qualquer caracter que estiver entre esses colchetes
        // ? - zero ou uma ocorrência
        // * - zero ou mais ocorrências
        // + - uma ou mais ocorrências
        // {} - valor mais específico
        // () - agrupamento
        // | - ou
        // $ - fim da linha


        String regex = "0[xX]([\\da-fA-F])+(\\s|$)"; // expressão a ser encontrada
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
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
