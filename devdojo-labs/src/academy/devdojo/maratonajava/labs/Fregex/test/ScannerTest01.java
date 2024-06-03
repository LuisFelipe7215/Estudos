package academy.devdojo.maratonajava.labs.Fregex.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Lelouch,Naruto,Goku,true,100";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while (scanner.hasNext()){

            if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean "+ b);
            } else if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Inteiro " + i);
            } else {
                System.out.println(scanner.next());
            }

        }
    }
}
