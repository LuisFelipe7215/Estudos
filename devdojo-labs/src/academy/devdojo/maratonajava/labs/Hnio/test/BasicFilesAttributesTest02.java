package academy.devdojo.maratonajava.labs.Hnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFilesAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/novodonovo.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class); // criando uma basicFileAttributes que preicsa de um path, e uma basicFIleAtributes

        FileTime creationTime = basicFileAttributes.creationTime(); // tempo de criação
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime(); // última vez modificado
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime(); // última vez acessado

        System.out.println("Tempo de criação: " + creationTime);
        System.out.println("Última vez modificado: " + lastModifiedTime);
        System.out.println("Última vez acessado: " + lastAccessTime);
        System.out.println("--------------------------------");

        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);// criando uma basicFileAttributeView que preicsa de um path, e uma basicFIleAtributeView

        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis()); // pegando o tempo atual
        basicFileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime); // setando o tempos do arquivo, trocando o lastAcessTime por outro

        creationTime = basicFileAttributeView.readAttributes().creationTime(); // primeiro lendo os atributos e depois atribuindo o novo valor a variável de referencia
        lastModifiedTime = basicFileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = basicFileAttributeView.readAttributes().lastAccessTime();

        System.out.println("Tempo de criação: " + creationTime);
        System.out.println("Última vez modificado: " + lastModifiedTime);
        System.out.println("Última vez acessado: " + lastAccessTime);


    }
}
