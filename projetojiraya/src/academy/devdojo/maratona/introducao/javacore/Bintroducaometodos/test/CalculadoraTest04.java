package academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        int a = 11;
        int b = 22;

        c.imprimeDoisNumeros(a, b);

        System.out.println(a);
        System.out.println(b);

    }
}
