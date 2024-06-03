package academy.devdojo.maratonajava.labs.Fregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . - tudo que estiver entre as expressões


        String regex = "([a-zA-Z\\d\\.-_])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // expressão a ser encontrada
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, @#zoro@mail.br, teste@gmail.com.br, sakura@mail";
        Pattern pattern = Pattern.compile(regex); // O padrão sendo compilado
        Matcher matcher = pattern.matcher(texto); // onde o padrão será encontrado

        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[4].trim());

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }


    }
}
