package academy.devdojo.maratonajava.labs.Bstrings.test;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qualquer coisa");
        String stringDigitada = sc.nextLine();

        StringBuffer sb = new StringBuffer(stringDigitada);


        System.out.println("Números de caracteres digitados: " + stringDigitada.length());
        System.out.println("String com suas letras maiúsculas: " + stringDigitada.toUpperCase());
        vogais(stringDigitada);
        String lowerCase = stringDigitada.toLowerCase();
        System.out.println("String começa com UNI " + lowerCase.startsWith("uni"));
        System.out.println("String termina com RIO " + lowerCase.endsWith("rio"));
        digitos(stringDigitada);
        sb.reverse();
        sb.reverse();
        String reverse = String.valueOf(sb.reverse());
        if (reverse.equals(stringDigitada)){
            System.out.println("é um palidromo");
        } else {
            System.out.println("não é um palidromo");
        }



    }

    private static void digitos(String stringDigitada) {
        char digito;
        for (int i = 0; i < stringDigitada.length(); i++) {
            digito = stringDigitada.charAt(i);

            if (Character.isDigit(digito)) {
                System.out.print(digito);
            }

        }

    }

    private static void vogais(String stringDigitada) {
        stringDigitada = stringDigitada.toLowerCase();

        for (int i = 0; i < stringDigitada.length(); i++) {
            char letra = stringDigitada.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.print(letra);
            }
        }
        System.out.println();
    }
}
