package academy.devdojo.maratona.introducao.javacore.Hheranca.test;

import academy.devdojo.maratona.introducao.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratona.introducao.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratona.introducao.javacore.Hheranca.dominio.Pessoa;

public class Herancateste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Michael Jackson");
        Funcionario funcionario = new Funcionario("felps");

        endereco.setCep("00001-000");
        endereco.setRua("Rua dos gravatas");


        pessoa.setCpf("0000000");

        pessoa.setEndereco(endereco);

        funcionario.setCpf(pessoa.getCpf());
        funcionario.setEndereco(endereco);
        funcionario.setSalario(10000);

        funcionario.imprime();
        pessoa.imprime();

    }
}
