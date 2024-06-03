package academy.devdojo.maratonajava.labs.Iserialization.test;

import academy.devdojo.maratonajava.labs.Iserialization.domain.Aluno;
import academy.devdojo.maratonajava.labs.Iserialization.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(21L, "Platinex", "1312323421");
        Turma turma = new Turma("Maratona Java Virado no Jiraya em breve ricos");
        aluno.setTurma(turma);
        serializar(aluno); // serializando aluno
        deserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser"); // passando o caminho

        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno); // escrevendo o estado do objeto nesse arquivo
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser"); // passando o caminho

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject(); // fazendo a leitura do arquivo
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
