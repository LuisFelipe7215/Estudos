package academy.devdojo.maratonajava.labs.Iserialization.domain;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 707498207982916621L;
    private Long id;
    private String username;
    private transient String password;
    private static final String NOME_ESCOLA = "Dev Dojo viradão no Jiraya";
    private transient Turma turma;

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Aluno(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        System.out.println("Dentro do construtor");
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
