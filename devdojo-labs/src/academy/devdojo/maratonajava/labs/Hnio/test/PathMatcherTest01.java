package academy.devdojo.maratonajava.labs.Hnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta1/file.bkp");
        Path path2 = Paths.get("pasta/subpasta1/file.txt");
        Path path3 = Paths.get("pasta/subpasta1/file.java");

        matchPath(path1, "glob:**.bkp"); // verificando se o arquivo termina com .bkp
        matchPath(path2, "glob:**.txt"); // verificando se o arquivo termina com .txt
        matchPath(path3, "glob:**.java"); // verificando se o arquivo termina com .java

        matchPath(path1, "glob:**/*.{bkp,txt,java}"); // verificando se o arquivo termina em .bkp, .txt, .java
        matchPath(path2, "glob:**/*.{bkp,txt,java}"); // verificando se o arquivo termina em .bkp, .txt, .java
        matchPath(path3, "glob:**/*.{bkp,txt,java}"); // verificando se o arquivo termina em .bkp, .txt, .java

        matchPath(path1, "glob:**/*.???"); // verificando se arquivo termina em 3 caracteres após o ponto
        matchPath(path2, "glob:**/*.???"); // verificando se arquivo termina em 3 caracteres após o ponto
        matchPath(path3, "glob:**/*.???"); // verificando se arquivo termina em 3 caracteres após o ponto
        matchPath(path3, "glob:**/*file.????");


    }

    public static void matchPath(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);

        System.out.println(glob + ":" + matcher.matches(path));
    }
}
