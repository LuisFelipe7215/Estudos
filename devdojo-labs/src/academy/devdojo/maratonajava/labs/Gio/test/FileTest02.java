package academy.devdojo.maratonajava.labs.Gio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File folder = new File("arquivo");
        boolean isFolderCreated = folder.mkdir(); // criando uma pasta
        System.out.println("A pasta foi criada? " + isFolderCreated);

        File fileDirectory = new File(folder, "teste.txt");  // criando um arquivo dentro da pasta
        boolean isFileCreated = fileDirectory.createNewFile();
        System.out.println("O arquivo foi criado? " + isFileCreated);

        File fileRenamed = new File(folder, "file_renamed.txt");
        boolean isRenamed = fileDirectory.renameTo(fileRenamed); // renomeando o arquivo
        System.out.println("O arquivo foi renomeado: " + isRenamed);

        File folderRenamed = new File("arquivo2");
        boolean isFolderRenamed = folder.renameTo(folderRenamed); // renomeando a pasta
        System.out.println("A pasta foi renomeada: " + isFolderRenamed);


    }
}
