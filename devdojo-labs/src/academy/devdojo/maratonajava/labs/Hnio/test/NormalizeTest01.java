package academy.devdojo.maratonajava.labs.Hnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/platinex/dev";
        String arquivoTxt = "../../dev";

        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize()); // caminho do arquivo normalizado

        Path path2 = Paths.get("/home/./platinex/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
