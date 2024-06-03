package academy.devdojo.maratonajava.labs.Hnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pasta = Paths.get("C:\\Users\\afcga\\Exercism\\java\\devdojo-labs\\pasta"); // criando a referência de um diretório

        if (Files.notExists(pasta)) { // verificando se a pasta não existe
            Path pastaDirectory = Files.createDirectory(pasta); // criando um pasta
        }

        Path subDirectories = Paths.get("pasta/subpasta/subsubpasta"); // criando a referência de um subdiretório
        Path directories = Files.createDirectories(subDirectories); //  criando um subdiretório

        Path file = Paths.get(subDirectories.toString(), "file.txt"); //  criando a referência de um arquivo

        if (Files.notExists(file)) { // verificando se o arquivo não existe
            Path fileCreated = Files.createFile(file); //  criando um arquivo
        }

        Path source = file; // referência do arquivo a ser copiado
        Path target = Paths.get(file.getParent().toString(), "file_renamed.txt"); // destino do arquivo copiado

        Path copy = Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING); // copiando o arquivo


    }
}
