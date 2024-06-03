package academy.devdojo.maratonajava.labs.Gio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("xbox.txt");

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.flush(); // fazer o sistema cuspir os recursos
            fw.write("Xbox mil grau, ha ha ha ha\n"); // escrevendo no arquivo

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
