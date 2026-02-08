package academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio.Calculadora;

public class calculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividaDoisNumeros(150f,10600f);
        System.out.println(result);

    }
}
