package academy.devdojo.maratona.introducao.javacore.PStrings.Test;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Miguel Suane");

        sb.append("mi").append("pri");

        String subs = sb.substring(0,4);

        System.out.println(sb);
        System.out.println(subs);
        sb.reverse();
        System.out.println(sb);


    }
}
