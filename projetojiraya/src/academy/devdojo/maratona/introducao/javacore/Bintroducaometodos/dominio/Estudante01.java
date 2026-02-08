package academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio;

import academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.test.EstudanteTest01;

public class Estudante01 {
    public static void main(String[] args) {
        EstudanteTest01 estudante01 = new EstudanteTest01();

        EstudanteTest01 estudante02 = new EstudanteTest01();

        EstudanteTest01 estudante03 = new EstudanteTest01();

        ImpressoraEstudante imprime = new ImpressoraEstudante();

        estudante03.sexo = 'F';
        estudante03.idade = 22;
        estudante03.nome = "Andre";

        estudante02.sexo = 'F';
        estudante02.idade = 45;
        estudante02.nome = "Elizangela";

        estudante01.sexo = 'M';
        estudante01.idade = 22;
        estudante01.nome = "Miguel";

        imprime.imprime(estudante01);
        imprime.imprime(estudante02);
        imprime.imprime(estudante03);
    }
}
