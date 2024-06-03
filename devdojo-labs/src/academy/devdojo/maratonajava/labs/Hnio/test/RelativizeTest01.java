package academy.devdojo.maratonajava.labs.Hnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/platinex");
        Path clazz = Paths.get("home/platinex/dev/OlaMundo.java");
        Path pathToClass = dir.relativize(clazz);

        System.out.println(pathToClass); // caminho para chegar ao clazz apartir do dir

        Path absoluto1 = Paths.get("/home/platinex");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/platinex/dev/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.212134213");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 "+ relativo1.relativize(relativo2));
        System.out.println("5 "+ absoluto1.relativize(relativo1)); // lança uma exceção, pq o Java não sabe como chegar no arquivo relativo por meio do absoluto


    }
}
