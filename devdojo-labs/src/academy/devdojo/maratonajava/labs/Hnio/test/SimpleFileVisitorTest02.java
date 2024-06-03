package academy.devdojo.maratonajava.labs.Hnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class listAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)  { // invocado quando entra em um diretorio
        System.out.println("abrindo " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException { // Ao tentar ler um arquivo, caso estiver oculto ou sem permissão de leitura, uma excenção é lançada
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException { // invocado quando sai de um direyório
        System.out.println("fechando " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}


public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("pasta");
        Files.walkFileTree(root, new listAllFiles()); // nesse método precisa de um Path e um objeto do tipo SimpleFileVisitor
    }
}
