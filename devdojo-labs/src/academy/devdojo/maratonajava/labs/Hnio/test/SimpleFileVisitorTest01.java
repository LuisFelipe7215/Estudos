package academy.devdojo.maratonajava.labs.Hnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class listJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

//        String texto = file.getFileName().toString();
//        String padrao = "([a-zA-Z\\d])+\\.(java)+";
//
//        Pattern pattern = Pattern.compile(padrao);
//        Matcher matcher = pattern.matcher(texto);
//
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

        if (file.getFileName().toString().endsWith(".java")) { // verificando se o arquivo termina com .java
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }
}


public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new listAllFiles()); // nesse método precisa de um Path e um objeto do tipo SimpleFileVisitor
    }
}
