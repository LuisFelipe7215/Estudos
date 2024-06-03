package academy.devdojo.maratonajava.labs.Gio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("xbox.txt"); // dá um nome ao arquivo ou colocar seu caminho absoluto
        try {
            boolean isCreated = file.createNewFile(); // criar um novo arquivo
            System.out.println("O arquivo foi criado: " + isCreated);
            System.out.println("Nome do arquivo: " + file.getName());
            System.out.println("Caminho absoluto: " + file.getAbsoluteFile());
            System.out.println("é diretório: " + file.isDirectory());
            System.out.println("é arquivo: " + file.isFile());
            System.out.println("está escondido: " + file.isHidden());
            System.out.println("Pode ser lido: " + file.canRead());
            System.out.println("Pode ser executado: " + file.canExecute());
            System.out.println("Ultima vez que foi modificado: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());

            boolean isExists = file.exists();

            if (isExists) {
                boolean isDelete = file.delete(); // deletar o arquivo
                System.out.println("O arquivo foi deletado: " + isDelete);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
