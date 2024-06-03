package academy.devdojo.maratonajava.labs.Fregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestesComRegex {
    public static void main(String[] args) {
        String regex = "([a-zA-Z])+(\\d)+([!@#%$&*-_?])+";
        String texto = "Ronaldo123! Lob231% Britana23 @#$##$$#";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas");



        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
