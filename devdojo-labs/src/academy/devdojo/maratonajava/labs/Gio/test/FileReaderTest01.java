package academy.devdojo.maratonajava.labs.Gio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("xbox.txt");

        try (FileReader fr = new FileReader(file)){
            int i; // variável para iterar

            while ((i = fr.read()) != -1){ // o inteiro está recebendo o retorno do read()
                System.out.print((char) i); // fazendo um casting de inteiro para char
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
