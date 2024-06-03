package academy.devdojo.maratonajava.labs.Eresourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundlesTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt_BR")); // pegando a base messages e a lingua
        System.out.println(bundle.getString("hello.world")); // usando a chave declarada no arquivo
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("good.afternoon"));
        System.out.println(bundle.getString("good.night"));

        bundle = ResourceBundle.getBundle("messages", new Locale("en_ES"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("good.afternoon"));
        System.out.println(bundle.getString("good.night"));
        System.out.println(bundle.getString("apple"));
        System.out.println(bundle.getString("hi"));



    }
}
