package academy.devdojo.maratonajava.labs.Hnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip"); // o arquivo zip que será criado
        Path arquivoParaZipar = Paths.get("pasta/subpasta1/subsubpasta1"); // o que será zipado
        zip(arquivoZip, arquivoParaZipar);

    }

    public static void zip(Path arquivoZip, Path arquivoParaZipar) {

        try (ZipOutputStream outputStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoParaZipar)) {

            for (Path file: directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString()); // indicando que está entrando
                outputStream.putNextEntry(zipEntry); // colocando a entrada
                Files.copy(file, outputStream); // copiando o conteúdo do arquivo
                outputStream.closeEntry(); // fechando a entrada
            }

            System.out.println("Arquivo criado com sucesso");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
