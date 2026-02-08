package academy.devdojo.maratona.introducao.javacore.PStrings.Test;

public class StringsTest {
    public static void main(String[] args) {

        String nome = "Miguel";
        String nums = "012345566";

        System.out.println(nome.isEmpty());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.charAt(3));
        System.out.println(nome.length());
        System.out.println(nome.startsWith("M"));
        System.out.println(nums.replace('2', '9'));
        System.out.println(nums.length());
        System.out.println(nums.substring(4));
        System.out.println(nome.trim());



    }
}
