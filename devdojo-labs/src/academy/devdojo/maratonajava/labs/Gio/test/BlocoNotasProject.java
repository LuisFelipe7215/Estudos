package academy.devdojo.maratonajava.labs.Gio.test;

import java.io.*;
import java.util.Scanner;

public class BlocoNotasProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File arquivo = new File("teste.txt");

        try (FileWriter fw = new FileWriter(arquivo, true); BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.println("Escreva no arquivo:");
            String texto = sc.next();

            bw.write(texto);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileReader fr = new FileReader(arquivo); BufferedReader br = new BufferedReader(fr)){

            String read;

            while ((read = br.readLine()) != null){
                System.out.println(read);
            }

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
