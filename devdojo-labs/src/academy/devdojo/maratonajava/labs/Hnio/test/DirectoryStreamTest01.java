package academy.devdojo.maratonajava.labs.Hnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get(".");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) { // DirectoryStream é um classe genérica

            for (Path path : stream) {
                System.out.println(path.getFileName());
            }

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
