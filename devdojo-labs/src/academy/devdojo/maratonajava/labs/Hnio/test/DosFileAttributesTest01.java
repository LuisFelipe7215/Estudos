package academy.devdojo.maratonajava.labs.Hnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/teste.txt");

        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println("Escondido: " + dosFileAttributes.isHidden()); // verificando se o arquivo está oculto
        System.out.println("Modo leitura: " + dosFileAttributes.isReadOnly()); // verificando se está no modo apenas leitura
        System.out.println("------------------------------------------------");

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setReadOnly(true); // setando para ser apenas leitura
        fileAttributeView.setHidden(true); // setando para ser oculto

        System.out.println("Escondido: " + fileAttributeView.readAttributes().isReadOnly());
        System.out.println("Modo leitura: " + fileAttributeView.readAttributes().isHidden());
    }
}
