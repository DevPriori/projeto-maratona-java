package academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio.Pessoa01;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa01 pessoa1 = new Pessoa01();

        pessoa1.setIdade(23);
        pessoa1.setNome("Naturo");

        //pessoa1.imprime();
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getNome());
    }
}
