package academy.devdojo.maratonajava.labs.Hnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/platinex");
        Path file = Paths.get("dev/xbox.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve); // resolvendo dois caminhos relativcs

        Path absoluto = Paths.get("/home/platinex");// absoluto
        Path absoluto2 = Paths.get("/casa/pratinha");
        Path relativo = Paths.get("dev"); // relativo
        Path arquivo = Paths.get("playstation.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(arquivo));
        System.out.println("3 " + relativo.resolve(absoluto)); // relativo não resolve com absoluto
        System.out.println("4 " + relativo.resolve(arquivo)); // dois relativos são resolvidos
        System.out.println("5 " + arquivo.resolve(absoluto));
        System.out.println("6 " + arquivo.resolve(relativo));
        System.out.println("7 " + absoluto.resolve(absoluto2)); // absoluto não resolve com outro absoluto
    }
}
