package academy.devdojo.maratonajava.labs.Hnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathProject {
    public static void main(String[] args) throws IOException {
        Path caminho = Paths.get("C:\\Users\\afcga\\Exercism\\java\\devdojo-labs", "project");

        if (Files.notExists(caminho)) {
            Path criandoArquivoProject = Files.createDirectory(caminho);
        }

        Path criandoSubdiretorios = Paths.get("project/projectNIO/domain");
        Path criandoMaisUmSubDiretorio = Paths.get("project/projectNIO/test");
        Path directories = Files.createDirectories(criandoSubdiretorios);

        if (Files.notExists(criandoMaisUmSubDiretorio)) {
            Path directory = Files.createDirectory(criandoMaisUmSubDiretorio);
        }

    }
}
