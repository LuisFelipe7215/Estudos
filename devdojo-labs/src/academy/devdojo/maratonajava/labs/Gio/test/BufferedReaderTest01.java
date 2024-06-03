package academy.devdojo.maratonajava.labs.Gio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("xbox.txt");

        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){

            String read;

            while ((read = br.readLine()) != null){
                System.out.println(read);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
