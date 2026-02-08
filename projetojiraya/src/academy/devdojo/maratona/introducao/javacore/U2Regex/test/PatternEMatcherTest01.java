package academy.devdojo.maratona.introducao.javacore.U2Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEMatcherTest01 {
    public static void main(String[] args) {

        /*
        \d = todos os digitos "12345"
        \D = tudo que nao for digito
        \s = todos os espaços em branco
        \S = todos os caracteres preenchidos
        \w = a-z, A-Z e _
        \W = tudo que nao for incluso no \w
        */
        String regex = "0[xX]([\\da-fA-F])+(\\s|$)";

        String texto = "0x 0x 0xAD34 0XR 0x56 0XFT3";
        String indice = "0123456789";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("text:  " +texto);
        System.out.println("indice:" + indice);
        System.out.println("regex: " +regex);

        while(matcher.find()){
            System.out.println(matcher.start()+ " "+ matcher.group());
        }

    }
}
