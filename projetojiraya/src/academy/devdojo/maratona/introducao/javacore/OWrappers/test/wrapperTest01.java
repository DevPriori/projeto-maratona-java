package academy.devdojo.maratona.introducao.javacore.OWrappers.test;

public class wrapperTest01 {
    public static void main(String[] args) {
        byte ByteP = 1;
        int IntP = 1;
        long LongP = 10L;
        char CharP = 'a';
        String StringP = "a";
        boolean BooleanP = true;
        short ShortP = 1;
        float FloatP = 1F;

        Byte ByteW = 1;
        Integer IntW = 1;
        Long LongW = 10L;
        Character CharW = 'a';
        String StringW = "a";
        Boolean BooleanW = true;
        Short ShortW = 1;
        Float FloatW = 1F;

        Integer intW2 = Integer.parseInt("2");
        System.out.println(intW2);

        boolean bool = Boolean.parseBoolean("tRUe");
        System.out.println(bool);

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetter('2'));
        System.out.println(Character.isLetterOrDigit('"'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toTitleCase('b'));
        System.out.println(Character.toUpperCase('b'));
        System.out.println(Character.toLowerCase('b'));


    }
}
