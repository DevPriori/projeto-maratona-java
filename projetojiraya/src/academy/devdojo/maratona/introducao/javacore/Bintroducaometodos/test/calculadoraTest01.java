package academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio.Calculadora;

public class calculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(10,100);
        calculadora.subtraiDoisNumeros(90, -9000);

    }
}
