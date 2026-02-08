package academy.devdojo.maratona.introducao.javacore.U2Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEMatcherTest02 {
    public static void main(String[] args) {

        /*
        \d = todos os digitos "12345"
        \D = tudo que nao for digito
        \s = todos os espaços em branco
        \S = todos os caracteres preenchidos
        \w = a-z, A-Z e _
        \W = tudo que nao for incluso no \w
        */
        String regex = "([a-zA-Z\\d\\.])+@(([a-zA-Z\\d\\.])+)+";

        String texto = "miguelpri@amil.com, pri@gmail.br, !@figetspinne@@@, get.coauth@hot.c 22$dd@g.co";
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
